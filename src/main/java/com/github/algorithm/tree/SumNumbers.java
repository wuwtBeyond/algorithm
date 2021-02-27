package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class SumNumbers {

    private int sum = 0;
    private int num = 0;
    public int sumNumbers(TreeNode root) {

        postOrderTraversal(root);

        return sum;
    }

    private void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        num = num * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += num;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        num = (num - root.val) / 10;
    }

}
