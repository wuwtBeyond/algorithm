package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class IsValidBST {
    private long val;

    public boolean isValidBST(TreeNode root) {
        val = Long.MIN_VALUE;
        return inOrderTraversal(root);
    }

    private boolean inOrderTraversal(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = inOrderTraversal(root.left);
        if (root.val <= val) {
            return false;
        }
        val = root.val;

        boolean right = inOrderTraversal(root.right);
        return left && right;
    }
}
