package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        int length = nums.length;

        return binaryBuildTree(nums, 0, length-1);
    }

    /**
     * 递归函数定义：以[left,right]区间构造一颗高度平衡二叉搜索树
     * @param nums
     * @param left
     * @param right
     * @return
     */
    private TreeNode binaryBuildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int middle = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[middle]);

        root.left = binaryBuildTree(nums, left, middle-1);
        root.right = binaryBuildTree(nums, middle+1, right);

        return root;
    }

}
