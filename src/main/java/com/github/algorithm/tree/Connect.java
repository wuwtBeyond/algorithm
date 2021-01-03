package com.github.algorithm.tree;

import com.github.bean.Node;

public class Connect {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        preOrderConnect(root.left, root.right);

        return root;
    }

    /**
     * 完全二叉树
     * 递归函数定义：left.next = right
     * 注意同一层右节点连接左节点
     * @param left
     * @param right
     */
    private void preOrderConnect(Node left, Node right) {
        if (left == null || right == null) {
            return;
        }

        left.next = right;

        preOrderConnect(left.left, left.right);
        preOrderConnect(right.left, right.right);

        preOrderConnect(left.right, right.left);
    }



}
