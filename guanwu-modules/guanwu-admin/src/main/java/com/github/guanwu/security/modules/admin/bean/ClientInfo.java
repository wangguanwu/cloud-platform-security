package com.github.guanwu.security.modules.admin.bean;

import com.github.guanwu.security.common.util.jwt.IJWTInfo;
import com.github.guanwu.security.common.util.jwt.JWTInfo;

/**
 * clientinfo
 *
 * @author guanwu
 * @created on 2021-08-09 21:36:50
 **/
public class ClientInfo implements IJWTInfo {
    String clientId;
    String name;
    String id;

    public ClientInfo(String clientId, String name, String id) {
        this.clientId = clientId;
        this.name = name;
        this.id = id;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getUniqueName() {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getTokenId() {
        return null;
    }
}
