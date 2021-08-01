package com.github.guanwu.security.modules.admin.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.guanwu.security.modules.mapper.biz.UserBiz;
import com.github.guanwu.security.modules.mapper.entity.User;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("user")
public class UserController extends BaseController<UserBiz,User> {

}