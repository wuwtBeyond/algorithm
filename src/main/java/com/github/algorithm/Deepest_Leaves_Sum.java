package com.github.algorithm;

import com.github.bean.TreeNode;

import java.util.LinkedList;

/**
 * @author : wuwentao
 * @date : 2020/4/16
 */
public class Deepest_Leaves_Sum {

//    private int deep_left_max = 0;
//    private int deep_right_max = 0;
//
//    private int sum_left = 0;
//    private int sum_right = 0;

    private int sum = 0;
    private int maxDepth = 0;

    /**
     * 层次遍历，每一层的节点放在队列里面，每一层累加节点值，新的一层清零
     * 最快方法、递归
     * @param root
     * @return
     */
    public int deepestLeavesSum(TreeNode root) {

        dfs(root, 0);

        return sum;
//        if (root == null) return 0;
//
//        int res = 0, i;
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while (queue.size() != 0) {
//            int size = queue.size();
//            for (i = 0, res = 0;i < size; i ++) {
//                TreeNode node = queue.poll();
//                res += node.val;
//                if (node.left != null) queue.add(node.left);
//                if (node.right != null) queue.add(node.right);
//            }
//        }
//
//        return res;
    }

    /**
     * 每到一层，去更新最大深度和最新一层的和
     * 左右递归
     * @param root
     * @param depth
     */
    private void dfs(TreeNode root, int depth) {
        if (root == null) return;

        if (depth == maxDepth) {
            sum += root.val;
        }
        if (depth > maxDepth) {
            maxDepth = depth;
            sum = root.val;
        }

        dfs(root.left, depth+1);
        dfs(root.right, depth+1);

    }

//    private int deepestLeavesSum_helper(TreeNode root, int deep, int deep_left, int deep_right, int sum) {
//        if (root == null) return sum;

//        if (deep == deep_max) {
//            sum += root.val;
//        }else if (deep > deep_max) {
//            sum = root.val;
//        }

//        sum_left = deepestLeavesSum_helper(root.left, ++deep, sum);
//        sum_right = deepestLeavesSum_helper(root.right, ++deep, sum);

//        if (deep_left_max > deep_right_max) {
//            return sum_left;
//        }else if (deep_left_max < deep_right_max) {
//            return sum_right;
//        }else {
//            return sum_left + sum_right;
//        }
//    }
}
