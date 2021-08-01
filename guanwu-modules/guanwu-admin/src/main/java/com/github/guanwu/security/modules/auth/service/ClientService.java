package com.github.guanwu.security.modules.auth.service;

import com.github.guanwu.security.common.service.BaseService;
import com.github.guanwu.security.modules.auth.mapper.ClientMapper;
import com.github.guanwu.security.modules.auth.mapper.ClientServiceMapper;
import org.springframework.stereotype.Service;

import com.github.guanwu.security.modules.auth.entity.Client;

/**
 * 
 *
 * @author guanwu
 * @email 2531507093@qq.com
 * @version 2021-07-31 18:11:14
 */
@Service
public class ClientService extends BaseService<ClientMapper,Client> {
    private final ClientServiceMapper clientServiceMapper;
    private final ClientServiceService clientServiceService;


    public ClientService(ClientServiceMapper clientServiceMapper, ClientServiceService clientServiceService) {
        this.clientServiceMapper = clientServiceMapper;
        this.clientServiceService = clientServiceService;
    }
}