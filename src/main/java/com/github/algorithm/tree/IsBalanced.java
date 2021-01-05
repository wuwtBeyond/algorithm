package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class IsBalanced {

    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    /**
     * 递归函数定义：以root为根的子树左右高度,如果高度差>1 return -1 否则返回当前子树高度
     * @param root
     * @return
     */
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        if (left == -1 || right == -1 || Math.abs(left-right) > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);
    }

}
