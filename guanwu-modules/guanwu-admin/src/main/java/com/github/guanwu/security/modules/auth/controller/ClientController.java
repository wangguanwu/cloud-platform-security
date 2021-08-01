package com.github.guanwu.security.modules.auth.controller;

import com.github.guanwu.security.modules.mapper.entity.Client;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("client")
public class ClientController extends BaseController<,Client> {

}