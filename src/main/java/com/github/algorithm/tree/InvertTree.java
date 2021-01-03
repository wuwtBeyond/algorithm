package com.github.algorithm.tree;

import com.github.bean.TreeNode;


public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        preOrderInvert(root);

        return root;
    }

    /**
     * 递归函数定义：翻转以root为根的左右孩子
     * @param root
     */
    private void preOrderInvert(TreeNode root) {
        if (root == null) {
            return ;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        preOrderInvert(root.right);
        preOrderInvert(root.left);
    }

}
