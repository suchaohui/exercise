package com.such.test.controller;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import javax.swing.tree.TreeNode;

/**
 * @Desp: 树相关
 * @Author: suzh
 * @Date: 2022/3/30 10:41 上午
 */
public class tree {


    // 二叉树深度
//    解法一：从上到下计算（前序遍历）
//    1、从根节点开始，每下降一层，就将深度+1
//
//    2、用全局变量来记录下最大深度
//
//    3、每当达到叶子节点时就与全局变量进行比较和更新
    class TreeNode{
        private Integer data;
        private TreeNode left;
        private TreeNode right;

    }

    class solution {
        // 全局深度
        Integer res = 0;

        public void dfs(TreeNode root, Integer length) {
            if (root == null) {
                res = Math.max(this.res, length);
            }
            dfs(root.left,length+1);
            dfs(root.right,length+1);
        }


    }

}
