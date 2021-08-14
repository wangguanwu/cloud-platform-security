package com.github.guanwu.security.modules.auth.service;

import java.util.List;

/**
 * @author guanwu
 * @created on 2021-08-09 22:33:43
 **/
public interface AuthClientService {

    /**
     * 获取授权的客户列表
     * @param serviceId
     * @param secret
     * @return
     */
    public List<String> getAllowedClient(String serviceId,String secret);

    public List<String> getAllowedClient(String serviceId);

    public void registryClient();

    public void validate(String clientId, String secret) throws Exception;


}
