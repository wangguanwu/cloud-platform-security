package com.github.guanwu.security.api.vo.authority;

import java.io.Serializable;

/**
 * @author guanwu
 * @created on 2021-08-10 23:04:40
 **/
public class PermissionInfo implements Serializable {
    private static final long serialVersionUID = -4620618993875334055L;
    private String code;
    private String type;
    private String uri;
    private String method;
    private String name;
    private String menu;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
