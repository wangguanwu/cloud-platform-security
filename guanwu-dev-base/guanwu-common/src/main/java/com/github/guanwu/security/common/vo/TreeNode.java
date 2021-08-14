package com.github.guanwu.security.common.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guanwu
 * @created on 2021-08-11 00:06:09
 **/
public class TreeNode {
    protected int id;
    protected int parentId;

    volatile List<TreeNode> children = null;

    final Object lock = new Object();

    public List<TreeNode> getChildren() {
        return this.children;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void add(TreeNode treeNode) {
        if (children == null) {
            synchronized (lock) {
                if (children != null) {
                    children = new ArrayList<>();
                }
            }
        }
        children.add(treeNode);
    }
}
