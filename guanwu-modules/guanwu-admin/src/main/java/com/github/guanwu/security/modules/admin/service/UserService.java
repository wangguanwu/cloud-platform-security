package com.github.guanwu.security.modules.admin.service;

import com.github.guanwu.security.common.service.BaseService;
import com.github.guanwu.security.modules.admin.entity.User;
import com.github.guanwu.security.modules.admin.mapper.UserMapper;
import com.github.guanwu.security.modules.admin.util.Sha256PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * 
 *
 * @author guanwu
 * @email 2531507093@qq.com
 * @version 2021-07-31 17:58:53
 */
@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class UserService extends BaseService<UserMapper, User> {

    private Sha256PasswordEncoder encoder = Sha256PasswordEncoder.getInstance();

    @Override
    public void insertSelective(User entity) {
        String password = encoder.encode(entity.getPassword());
        entity.setPassword(password);
        super.insertSelective(entity);
    }

    @Override
    public void updateSelectiveById(User entity) {
        super.updateSelectiveById(entity);
    }

    public User getUserByUsername(String userName) {
        User user = new User();
        user.setUsername(userName);
        return mapper.selectOne(user);
    }
}