package com.github.guanwu.security.modules.admin.rest;

import com.github.guanwu.security.common.rest.BaseController;
import com.github.guanwu.security.modules.mapper.biz.MenuBiz;
import com.github.guanwu.security.modules.mapper.entity.Menu;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("menu")
public class MenuController extends BaseController<MenuBiz,Menu> {

}