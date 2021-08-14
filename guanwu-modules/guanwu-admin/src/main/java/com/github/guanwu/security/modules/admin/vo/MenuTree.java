package com.github.guanwu.security.modules.admin.vo;

import com.github.guanwu.security.common.vo.TreeNode;

/**
 * @author guanwu
 * @created on 2021-08-11 00:05:57
 **/
public class MenuTree extends TreeNode {
    String icon;
    String title;
    String href;
    boolean speed = false;
    String path;
    String component;
    String authority;
    String redirect;
    String code;
    String type;
    String label;

    public MenuTree() {}

    public MenuTree(int id, String name, int parentId) {
        this.id = id;
        this.parentId = parentId;
        this.title = name;
        this.label = name;
    }

    public MenuTree(int id, String name, MenuTree parent) {
        this(id, name, parent.getId());
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public boolean isSpeed() {
        return speed;
    }

    public void setSpeed(boolean speed) {
        this.speed = speed;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
