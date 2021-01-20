package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class GetMinimumDifference {
    private int min_abs = Integer.MAX_VALUE;
    private int last_value = 0;
    private boolean first = true;

    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        return min_abs;
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        if (first) {
            last_value = root.val;
            first = false;
        } else {
            min_abs = Math.min(min_abs, Math.abs(root.val-last_value));
            last_value = root.val;
        }

        inOrderTraversal(root.right);
    }
}
