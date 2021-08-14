package com.github.guanwu.security.modules.admin.rpc.service;

import com.alibaba.fastjson.JSON;
import com.github.guanwu.security.api.vo.authority.CheckPermissionInfo;
import com.github.guanwu.security.api.vo.authority.PermissionInfo;
import com.github.guanwu.security.api.vo.user.UserInfo;
import com.github.guanwu.security.common.constant.CommonConstants;
import com.github.guanwu.security.common.constant.RedisKeyConstant;
import com.github.guanwu.security.common.util.TreeUtil;
import com.github.guanwu.security.common.vo.FrontUser;
import com.github.guanwu.security.modules.admin.constant.AdminCommonConstant;
import com.github.guanwu.security.modules.admin.entity.Element;
import com.github.guanwu.security.modules.admin.entity.Menu;
import com.github.guanwu.security.modules.admin.entity.User;
import com.github.guanwu.security.modules.admin.service.ElementService;
import com.github.guanwu.security.modules.admin.service.MenuService;
import com.github.guanwu.security.modules.admin.service.UserService;
import com.github.guanwu.security.modules.admin.util.Sha256PasswordEncoder;
import com.github.guanwu.security.modules.admin.vo.MenuTree;
import com.github.guanwu.security.modules.auth.util.user.JwtTokenUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author guanwu
 * @created on 2021-08-10 22:38:17
 **/

@Service
public class PermissionService {
    private final UserService userService;

    private final MenuService menuService;

    private final ElementService elementService;

    private final JwtTokenUtil userAuthUtil;

    private Sha256PasswordEncoder encoder = Sha256PasswordEncoder.getInstance();

    private final StringRedisTemplate stringRedisTemplate;

    public PermissionService(UserService userService, MenuService menuService, ElementService elementService, JwtTokenUtil userAuthUtil, StringRedisTemplate stringRedisTemplate) {
        this.userService = userService;
        this.menuService = menuService;
        this.elementService = elementService;
        this.userAuthUtil = userAuthUtil;
        this.stringRedisTemplate = stringRedisTemplate;
    }

    public UserInfo getUserByUsername(String username) {
        UserInfo userInfo = new UserInfo();
        User user = userService.getUserByUsername(username);
        BeanUtils.copyProperties(user, userInfo);
        userInfo.setId(user.getId().toString());
        return userInfo;
    }

    public List<PermissionInfo> getAllPermission() {
        String key = RedisKeyConstant.REDIS_KEY_ALL_PERMISISON;
        String s = stringRedisTemplate.opsForValue().get(key);
        if (StringUtils.isBlank(s)) {
            List<Menu> menus = menuService.selectListAll();
            List<PermissionInfo> result = new ArrayList<>();
            menu2permission(menus, result);
            s = JSON.toJSONString(result);
            stringRedisTemplate.opsForValue().set(key, s, 12, TimeUnit.SECONDS);
        }
        List<PermissionInfo> permissionInfos = JSON.parseArray(s, PermissionInfo.class);
        return permissionInfos;
    }

    private void menu2permission(List<Menu> menus, List<PermissionInfo> result) {
        PermissionInfo info;
        for(Menu m : menus) {
            if (StringUtils.isBlank(m.getHref())) {
                m.setHref("/" + m.getCode());
            }
            info = new PermissionInfo();
            info.setCode(m.getCode());
            info.setType(AdminCommonConstant.RESOURCE_TYPE_MENU);
            info.setName(AdminCommonConstant.RESOURCE_ACTION_VISIT);
            String uri = m.getHref();
            if (!StringUtils.startsWith(uri, "/")) {
                uri = "/" + uri;
            }
            info.setUri(uri);
            info.setMenu(AdminCommonConstant.RESOURCE_REQUEST_METHOD_GET);
            info.setMenu(m.getTitle());
            result.add(info);
        }
    }

    public List<PermissionInfo> getPermissionByUsername(String username) {
        String key = String.format(RedisKeyConstant.REDIS_KEY_USER_PERMISISON,
                username);
        String s = stringRedisTemplate.opsForValue().get(key);
        if (!StringUtils.isBlank(s)) {
            User user = userService.getUserByUsername(username);
            List<Menu> menus = menuService.getUserAuthorityMenuByUserId(user.getId());
            List<PermissionInfo> result = new ArrayList<>();
            menu2permission(menus, result);
            List<Element> elements = elementService.getAuthorityElementByUserId(user.getId() + "");
            assert elements != null;
            element2permission(result, elements);
            stringRedisTemplate.opsForValue().set(key, JSON.toJSONString(result),
                    12, TimeUnit.HOURS);
            return result;
        }
        List<PermissionInfo> permissionInfos = JSON.parseArray(s, PermissionInfo.class);
        return permissionInfos;
    }

    private void element2permission(List<PermissionInfo> result, List<Element> elements) {
        elements.forEach(e -> {
            PermissionInfo info = new PermissionInfo();
            result.add(info);
            info.setCode(e.getCode());
            info.setType(e.getType());
            info.setUri(e.getUri());
            info.setMethod(e.getMethod());
            info.setName(e.getName());
            info.setMenu(e.getMenuId());
        });
    }

    private List<MenuTree> getMenuTree(List<Menu> menus, int root) {
        List<MenuTree> trees = new ArrayList<>();
        MenuTree node = null;
        for(Menu menu : menus) {
            node = new MenuTree();
            BeanUtils.copyProperties(menu, node);
            trees.add(node);
        }
        return TreeUtil.build(trees, root);
    }

    public FrontUser getUserInfo(String token) throws Exception {
        String username = userAuthUtil.getInfoFromToken(token).getUniqueName();
        if (StringUtils.isBlank(username)) {
            return new FrontUser();
        }
        UserInfo user = this.getUserByUsername(username);
        FrontUser frontUser = new FrontUser();
        BeanUtils.copyProperties(user, frontUser);
        List<PermissionInfo> permissionInfos = this.getPermissionByUsername(username);
        List<PermissionInfo> menus = permissionInfos.parallelStream()
                .filter(p -> p.getType().equals(CommonConstants.RESOURCE_TYPE_MENU))
                .collect(Collectors.toList());
        frontUser.setMenus(menus);
        List<PermissionInfo> elements = permissionInfos.parallelStream()
                .filter(p -> !p.getType().equals(CommonConstants.RESOURCE_TYPE_MENU))
                .collect(Collectors.toList());
        frontUser.setElements(elements);
        return frontUser;
    }

    public List<MenuTree> getMenuByUsername(String token) throws Exception {
        String username = userAuthUtil.getInfoFromToken(token).getUniqueName();
        if (null == username) {
            return null;
        }
        if (StringUtils.isBlank(username)) {
            return new ArrayList<>();
        }
        User user = userService.getUserByUsername(username);
        List<Menu> menus = menuService.getUserAuthorityMenuByUserId(user.getId());
        return getMenuTree(menus, AdminCommonConstant.ROOT);
    }

    public Mono<CheckPermissionInfo>
}
