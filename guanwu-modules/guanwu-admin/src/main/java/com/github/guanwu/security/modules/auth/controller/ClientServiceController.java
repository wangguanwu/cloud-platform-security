package com.github.guanwu.security.modules.auth.controller;

import com.github.guanwu.security.common.rest.BaseController;
import com.github.guanwu.security.modules.auth.entity.ClientService;
import com.github.guanwu.security.modules.auth.service.ClientServiceService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("clientService")
public class ClientServiceController extends BaseController<ClientServiceService, ClientService> {

}