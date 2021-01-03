package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class MinDepth {

    /**
     * 给定一个二叉树，找出其最小深度。
     *
     * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
     *
     * 说明：叶子节点是指没有子节点的节点。
     */
    /**
     * 递归函数定义：以root为根的二叉树的深度
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left != null && root.right != null) {
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        } else if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left != null) {
            return 1 + minDepth(root.left);
        } else {
            return 1 + minDepth(root.right);
        }
    }


}
