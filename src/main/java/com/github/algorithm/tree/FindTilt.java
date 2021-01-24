package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class FindTilt {
    private int sum;

    public int findTilt(TreeNode root) {
        postOrderTraversal(root);

        return sum;
    }

    private int postOrderTraversal(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = postOrderTraversal(root.left);
        int right = postOrderTraversal(root.right);

        sum += Math.abs(left-right);

        return root.val + left + right;
    }

}
