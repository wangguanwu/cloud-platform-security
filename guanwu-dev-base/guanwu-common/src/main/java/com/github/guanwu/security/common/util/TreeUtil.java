package com.github.guanwu.security.common.util;

import com.github.guanwu.security.common.vo.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author guanwu
 * @created on 2021-08-11 11:29:53
 **/
public class TreeUtil {

    public static <T extends TreeNode> List<T> build(List<T> treeNodes,
                                                     Object root) {
        List<T> trees = new ArrayList<>();
        for(T treeNode : treeNodes) {
            if (Objects.equals(treeNode.getParentId(), root)) {
                trees.add(treeNode);
            }
            for(T t : treeNodes) {
                if (t.getParentId() == treeNode.getId()) {
                    treeNode.add(t);
                }
            }
        }
        return trees;
    }


}
