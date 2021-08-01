package com.github.guanwu.security.modules.admin.rest;

import com.github.guanwu.security.common.rest.BaseController;
import com.github.guanwu.security.modules.admin.entity.User;
import com.github.guanwu.security.modules.admin.service.UserService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("user")
public class UserController extends BaseController<UserService, User> {

}