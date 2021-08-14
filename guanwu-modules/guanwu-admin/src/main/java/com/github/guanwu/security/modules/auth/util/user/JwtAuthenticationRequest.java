package com.github.guanwu.security.modules.auth.util.user;

import java.io.Serializable;

/**
 * @author guanwu
 * @created on 2021-08-09 22:25:33
 **/
public class JwtAuthenticationRequest implements Serializable {


    private static final long serialVersionUID = -4805845601277405939L;

    private String userName;
    private String password;
    private String verCode;
    private String uuid;

    public JwtAuthenticationRequest(String userName, String password, String verCode, String uuid) {
        this.userName = userName;
        this.password = password;
        this.verCode = verCode;
        this.uuid = uuid;
    }

    public JwtAuthenticationRequest() {

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerCode() {
        return verCode;
    }

    public void setVerCode(String verCode) {
        this.verCode = verCode;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
