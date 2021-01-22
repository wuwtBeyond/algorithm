package com.github;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : wuwentao
 * @date : 2020/4/14
 */
public class Test {
    List<Integer> pre;
    List<Integer> in;
    List<Integer> post;

    public static void main(String[] args) {

    }

    public int[][] threeOrders (TreeNode root) {
        pre = new LinkedList<>();
        in = new LinkedList<>();
        post = new LinkedList<>();

        preOrderTraversal(root);
        inOrderTraversal(root);
        postOrderTraversal(root);

        int[][] result = new int[3][pre.size()];
        int i = 0;
        for (Integer val : pre) {
            result[0][i++] = val;
        }
        i = 0;
        for (Integer val : in) {
            result[1][i++] = val;
        }
        i = 0;
        for (Integer val : post) {
            result[2][i++] = val;
        }

        return result;
    }

    private void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        post.add(root.val);
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderTraversal(root.left);
        in.add(root.val);
        preOrderTraversal(root.right);
    }

    private void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        pre.add(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

}
