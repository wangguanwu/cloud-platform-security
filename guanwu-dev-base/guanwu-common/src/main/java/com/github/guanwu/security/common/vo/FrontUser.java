package com.github.guanwu.security.common.vo;

import com.github.guanwu.security.api.vo.authority.PermissionInfo;

import java.util.List;

/**
 * @author guanwu
 * @created on 2021-08-11 20:29:30
 **/
public class FrontUser {
    public String id;
    public String username;
    public String name;
    private String description;
    private String image;
    private List<PermissionInfo> menus;
    private List<PermissionInfo> elements;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<PermissionInfo> getMenus() {
        return menus;
    }

    public void setMenus(List<PermissionInfo> menus) {
        this.menus = menus;
    }

    public List<PermissionInfo> getElements() {
        return elements;
    }

    public void setElements(List<PermissionInfo> elements) {
        this.elements = elements;
    }
}
