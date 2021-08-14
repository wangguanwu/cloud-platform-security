package com.github.guanwu.security.modules.admin.service;

import com.github.guanwu.security.common.service.BaseService;
import com.github.guanwu.security.modules.auth.entity.Client;
import com.github.guanwu.security.modules.auth.entity.ClientService;
import com.github.guanwu.security.modules.auth.mapper.ClientMapper;
import com.github.guanwu.security.modules.auth.mapper.ClientServiceMapper;
import com.github.guanwu.security.modules.auth.service.ClientServiceService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guanwu
 * @created on 2021-08-09 22:07:02
 **/

@Service
public class AdminClientService extends BaseService<ClientMapper, Client> {

    private final ClientServiceMapper clientServiceMapper;

    private final ClientServiceService clientServiceService;

    public AdminClientService(ClientServiceMapper clientServiceMapper, ClientServiceService clientServiceService) {
        this.clientServiceMapper = clientServiceMapper;
        this.clientServiceService = clientServiceService;
    }

    public List<Client> getClientService(int id) {
        return mapper.selectAuthorityServiceInfo(id);
    }

    public void modifyClientServices(int id, String clients) {
        if (!StringUtils.isEmpty(clients)) {
            String []cs = clients.split(",");
            for(String c : cs) {
                ClientService clientService = new ClientService();
                clientService.setServiceId(c);
                clientService.setClientId(String.valueOf(id));
                clientServiceService.insertSelective(clientService);
            }
        }
    }
}
