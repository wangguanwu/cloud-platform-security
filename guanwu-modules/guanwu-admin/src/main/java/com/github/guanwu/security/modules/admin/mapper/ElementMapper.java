package com.github.guanwu.security.modules.admin.mapper;

import com.github.guanwu.security.modules.admin.entity.Element;
import com.github.guanwu.security.modules.auth.entity.Client;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author guanwu
 * @email 2014314038@qq.com
 * @version 2021-07-31 18:10:18
 */

public interface ElementMapper extends Mapper<Element> {
    List<String> selectAllowedClient(String serviceId);

    List<Client> selectAuthorityServiceInfo(int clientId);
	
}
