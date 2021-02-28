package com.github.algorithm.tree;

import com.github.bean.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class GenerateTrees {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> pre = new LinkedList<>();
        if (n == 0) {
            return pre;
        }
        pre.add(null);
        for (int i = 1; i <= n; i++) {
            List<TreeNode> cur = new LinkedList<>();
            for (TreeNode root : pre) {
                TreeNode insert = new TreeNode(i);
                insert.left = root;
                cur.add(insert);
                for (int j = 0; j <= n; j++) {
                    TreeNode root_copy = treeCopy(root);
                    TreeNode right = root_copy;
                    int k = 0;
                    for (;k < j;k ++) {
                        if (right == null) {
                            break;
                        }
                        right = right.right;
                    }
                    if (right == null) {
                        break;
                    }
                    TreeNode rightTree = right.right;
                    insert = new TreeNode(i);
                    right.right = insert;
                    insert.left = rightTree;

                    cur.add(root_copy);
                }
            }
            pre = cur;
        }

        return pre;
    }

    private TreeNode treeCopy(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode newRoot = new TreeNode(root.val);
        newRoot.left = treeCopy(root.left);
        newRoot.right = treeCopy(root.right);
        return newRoot;
    }

    public static void main(String[] args) {
        GenerateTrees trees = new GenerateTrees();
        trees.generateTrees(3);
    }
}
