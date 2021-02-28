package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class KthSmallest {
    private int count;
    private int val;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inOrderTraversal(root);

        return val;
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        count--;
        if (count == 0) {
            val = root.val;
            return;
        }
        inOrderTraversal(root.right);
    }

}
