package com.github.algorithm.tree;

import com.github.bean.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class PathSum {

    List<List<Integer>> res = null;
    List<Integer> path = null;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res = new LinkedList<>();
        path = new LinkedList<>();

        postOrderTraversal(root, targetSum);

        return res;
    }

    private void postOrderTraversal(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }


        path.add(root.val);
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            res.add(new LinkedList<>(path));
        }

        postOrderTraversal(root.left, targetSum);
        postOrderTraversal(root.right, targetSum);
        path.remove(path.size()-1);
    }

}
