package com.github.guanwu.security.api.vo.user;

import java.io.Serializable;
import java.util.Date;

/**
 * @author guanwu
 * @created on 2021-08-10 22:46:05
 **/
public class UserInfo implements Serializable {


    private static final long serialVersionUID = -2823009768486445272L;
    public String id;
    public String username;
    public String password;
    public String name;
    private String description;
    private Date upTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }
}
