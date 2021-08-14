package com.github.guanwu.security.modules.admin.service;

import com.github.guanwu.security.common.service.BaseService;
import com.github.guanwu.security.modules.admin.constant.AdminCommonConstant;
import com.github.guanwu.security.modules.admin.entity.Element;
import com.github.guanwu.security.modules.admin.entity.Menu;
import com.github.guanwu.security.modules.admin.mapper.MenuMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * 
 *
 * @author guanwu
 * @version 2021-07-31 17:58:53
 */
@Service
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
public class MenuService extends BaseService<MenuMapper, Menu> {

    @Override
    public void insertSelective(Menu entity) {
        super.insertSelective(entity);
    }

    @Override
    public void updateSelectiveById(Menu entity) {
        if (AdminCommonConstant.ROOT == entity.getId()) {
            entity.setPath("/" + entity.getCode());
        } else {
            Menu parent = this.selectById(entity.getParentId());
            entity.setPath(parent.getPath() + "/" + entity.getCode());
        }
        super.updateSelectiveById(entity);
    }



    /**
     * 获取用户可以访问的菜单
     * @param id
     * @return
     */
    public List<Menu> getUserAuthorityMenuByUserId(int id) {
        return mapper.selectAuthorityMenuByUserId(id);
    }

    /**
     * 获取用户可以访问的系统
     * @param id
     * @return
     */
    public List<Menu> getUserAuthoritySystemByUserId(int id) {
        return mapper.selectAuthoritySystemByUserId(id);
    }



}