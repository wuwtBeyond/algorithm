package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class SumOfLeftLeaves {
    private int res = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        preOrderTraversal(root, false);
        return res;
    }

    private void preOrderTraversal(TreeNode root, boolean left) {
        if (root == null) {
            return ;
        }
        if (root.left == null && root.right == null && left) {
            res += root.val;
        }
        preOrderTraversal(root.left, true);
        preOrderTraversal(root.right, false);
    }
}
