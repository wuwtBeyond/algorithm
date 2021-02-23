package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class Flatten {

    /**
     * 空间复杂度=1
     * @param root
     */
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode next = curr.left;
                TreeNode predecessor = next;
                while (predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                predecessor.right = curr.right;
                curr.left = null;
                curr.right = next;
            }
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        TreeNode s1 = new TreeNode(1);
        TreeNode s2 = new TreeNode(2);
        TreeNode s3 = new TreeNode(5);
        TreeNode s4 = new TreeNode(3);
        TreeNode s5 = new TreeNode(4);
        TreeNode s6 = new TreeNode(6);

        s1.left = s2;
        s1.right = s3;
        s2.left = s4;
        s2.right = s5;
        s3.right = s6;

        Flatten flatten = new Flatten();
        flatten.flatten(s1);
    }
}
