package com.github.algorithm;

import com.github.bean.TreeNode;

/**
 * @author : wuwentao
 * @date : 2020/4/22
 */
public class Maximum_Binary_Tree {

//    TreeNode p = null;

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length <= 0) return null;

        TreeNode root = dfs(nums, 0, nums.length);

        return root;
    }

    private TreeNode dfs(int[] nums, int left, int right) {
        if (left >= right ) return null;

        int max_index = findMaxNumIndex(nums, left, right);
        TreeNode node = new TreeNode(nums[max_index]);
//        if (p == null) {
//            p = node;
//        }

        node.left = dfs(nums, 0, max_index);
        node.right = dfs(nums, max_index, nums.length);

        return node;
    }


    /**
     * [left, right)
     * @param nums
     * @param left
     * @param right
     * @return
     */
    private int findMaxNumIndex(int[] nums, int left, int right) {
        int max = nums[left];

        for (int i = left;i < right;i ++) {
            max = Math.max(max, nums[i]);
        }

        return max;
    }
}
