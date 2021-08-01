package com.github.guanwu.security.modules.admin.rest;

import com.github.guanwu.security.common.rest.BaseController;
import com.github.guanwu.security.modules.admin.entity.Menu;
import com.github.guanwu.security.modules.admin.service.MenuService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("menu")
public class MenuController extends BaseController<MenuService, Menu> {

}