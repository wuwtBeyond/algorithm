package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class ConvertBiNode {

    private TreeNode new_root;
    private TreeNode temp;

    public TreeNode convertBiNode(TreeNode root) {
        new_root = null;
        inOrderTraversal(root);

        return new_root;
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);

        if (new_root == null) {
            new_root = root;
        } else {
            temp.right = root;
        }
        root.left = null;
        temp = root;

        inOrderTraversal(root.right);
    }

}
