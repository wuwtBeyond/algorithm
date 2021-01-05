package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class DiameterOfBinaryTree {

    private int res = 0;
    /**
     * 递归函数定义：经过当前root节点路径的最大长度
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        postTraversal(root);
        return res-1;
    }

    /**
     * 递归函数定义：以root为根的最大高度
     * @param root
     * @return
     */
    private int postTraversal(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = postTraversal(root.left);
        int right = postTraversal(root.right);

        res = Math.max(res, left+right+1);

        return Math.max(left, right)+1;
    }

}
