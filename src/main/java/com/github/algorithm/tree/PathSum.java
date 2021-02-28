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

    // 任意节点自上而下的路径和
//    Map<Integer, Integer> prefixMap;
//    int target;
//
//    public int pathSum(TreeNode root, int sum) {
//        prefixMap = new HashMap<>();
//        target = sum;
//
//        prefixMap.put(0, 1);
//        return recur(root, 0);
//    }
//
//    private int recur(TreeNode node, int curSum) {
//        if(node == null) {
//            return 0;
//        }
//
//        int res = 0;
//        curSum += node.val;
//
//        res += prefixMap.getOrDefault(curSum - target, 0);
//        prefixMap.put(curSum, prefixMap.getOrDefault(curSum, 0) + 1);
//
//        int left = recur(node.left, curSum);
//        int right = recur(node.right, curSum);
//
//        res = res + left + right;
//
//        prefixMap.put(curSum, prefixMap.get(curSum) - 1);
//
//        return res;
//    }


}
