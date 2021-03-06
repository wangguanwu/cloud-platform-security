package com.github.guanwu.security.modules.auth.mapper;


import com.github.guanwu.security.modules.auth.entity.Client;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author guanwu
 * @email 2014314038@qq.com
 * @version 2021-07-31 18:11:14
 */

public interface ClientMapper extends Mapper<Client> {
    List<String> selectAllowedClient(String serviceId);

    List<Client> selectAuthorityServiceInfo(int clientId);
}
