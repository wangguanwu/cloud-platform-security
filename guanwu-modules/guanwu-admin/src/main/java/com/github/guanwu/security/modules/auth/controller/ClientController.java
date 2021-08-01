package com.github.guanwu.security.modules.auth.controller;

import com.github.guanwu.security.common.rest.BaseController;
import com.github.guanwu.security.modules.auth.entity.Client;
import com.github.guanwu.security.modules.auth.service.ClientService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("client")
public class ClientController extends BaseController<ClientService, Client> {

}