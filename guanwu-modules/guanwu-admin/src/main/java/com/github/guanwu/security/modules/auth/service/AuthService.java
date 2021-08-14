package com.github.guanwu.security.modules.auth.service;

import com.github.guanwu.security.modules.auth.util.user.JwtAuthenticationRequest;

import java.util.Map;

/**
 * @author guanwu
 * @created on 2021-08-09 22:24:26
 **/
public interface AuthService {
    Map login(JwtAuthenticationRequest request) throws Exception;
    String refresh(String oldToken) throws Exception;
    void validate(String token) throws Exception;
    void logout(String token) throws Exception;
}
