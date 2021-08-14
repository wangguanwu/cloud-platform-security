package com.github.guanwu.security.modules.auth.service.impl;

import com.github.guanwu.security.modules.auth.mapper.ClientMapper;
import com.github.guanwu.security.modules.auth.service.AuthService;
import com.github.guanwu.security.modules.auth.util.user.JwtAuthenticationRequest;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author guanwu
 * @created on 2021-08-10 11:59:47
 */

@Service
public class AuthServiceImpl implements AuthService {


    @Override
    public Map login(JwtAuthenticationRequest request) throws Exception {
        return null;
    }

    @Override
    public String refresh(String oldToken) throws Exception {
        return null;
    }

    @Override
    public void validate(String token) throws Exception {

    }

    @Override
    public void logout(String token) throws Exception {

    }
}
