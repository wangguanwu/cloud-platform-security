package com.github.guanwu.security.modules.auth.mapper;

import com.github.guanwu.security.modules.auth.entity.ClientService;
import tk.mybatis.mapper.common.Mapper;

/**
 * 
 * 
 * @author guanwu
 * @email 2531507093@qq.com
 * @version 2021-07-31 18:11:14
 */

public interface ClientServiceMapper extends Mapper<ClientService> {
    void deleteByServiceId(int id);
}
