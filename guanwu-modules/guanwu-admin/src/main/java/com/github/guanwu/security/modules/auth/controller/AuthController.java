package com.github.guanwu.security.modules.auth.controller;

import com.github.guanwu.security.modules.auth.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 认证
 *
 * @author guanwu
 * @created on 2021-08-09 22:22:03
 **/

@Slf4j
@RestController
@RequestMapping("/jwt")
public class AuthController {

    private String tokenHeader;

    private AuthService authService;
}
