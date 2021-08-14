package com.github.guanwu.security.modules.auth.service.impl;

import com.github.guanwu.security.common.exception.auth.ClientInvalidException;
import com.github.guanwu.security.common.util.UUIDUtils;
import com.github.guanwu.security.modules.auth.entity.Client;
import com.github.guanwu.security.modules.auth.mapper.ClientMapper;
import com.github.guanwu.security.modules.auth.service.AuthClientService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author guanwu
 * @created on 2021-08-09 22:35:50
 **/

@Service
public class DBAuthClientService implements AuthClientService {

    private final ClientMapper clientMapper;

    private final DiscoveryClient discoveryClient;

    private final ApplicationContext context;

    public DBAuthClientService(ClientMapper clientMapper, DiscoveryClient discoveryClient, ApplicationContext context) {
        this.clientMapper = clientMapper;
        this.discoveryClient = discoveryClient;
        this.context = context;
    }

    private Client getClient(String clientId, String secret) {
        Client client = new Client();
        client.setCode(clientId);
        client = clientMapper.selectOne(client);
        if (Objects.isNull(client) || !StringUtils.equals(client.getSecret(), secret)) {
            throw new ClientInvalidException("Client not found or Client secret is error!");
        }
        return client;
    }

    @Override
    public List<String> getAllowedClient(String clientId, String secret) {
        Client client = getClient(clientId, secret);
        List<String> clients = clientMapper.selectAllowedClient(client.getId()+"");
        if (Objects.isNull(clients)) {
            return new ArrayList<>();
        }
        return clients;
    }

    @Override
    public List<String> getAllowedClient(String serviceId) {
        return null;
    }

    private Client getClient(String clientId) {
        Client client = new Client();
        client.setCode(clientId);
        client = clientMapper.selectOne(client);
        return client;
    }

    @Override
    @Scheduled(cron = "0 0/1 * * * ?")
    public void registryClient() {
        discoveryClient.getServices().forEach(name -> {
            Client client = new Client();
            client.setName(name);
            client.setCode(name);
            Client dbClient = clientMapper.selectOne(client);
            if (Objects.isNull(dbClient)) {
                client.setSecret(UUIDUtils.generateShortUuid());
                clientMapper.insert(client);
            }
        });
    }

    @Override
    public void validate(String clientId, String secret) throws Exception {
        Client client = new Client();
        client.setCode(clientId);
        Client clientDb = clientMapper.selectOne(client);
        if (Objects.isNull(clientDb) || !StringUtils.equals(clientDb.getSecret(), secret)) {
            throw new ClientInvalidException("Client not found or Client secret is error!!");
        }
    }
}
