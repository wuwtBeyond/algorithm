package com.github.algorithm.tree;

import com.github.bean.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class LeafSimilar {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new LinkedList<>();
        List<Integer> leaf2 = new LinkedList<>();

        inOrderTraversal(root1, leaf1);
        inOrderTraversal(root2, leaf2);
        if (leaf1.size() != leaf2.size()) {
            return false;
        }
        for (int i = 0; i < leaf1.size(); i++) {
            if (leaf1.get(i) != leaf2.get(i)) {
                return false;
            }
        }

        return true;
    }

    private void inOrderTraversal(TreeNode root, List<Integer> leaf) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, leaf);
        if (root.left == null && root.right == null) {
            leaf.add(root.val);
        }
        inOrderTraversal(root.right, leaf);
    }
}
