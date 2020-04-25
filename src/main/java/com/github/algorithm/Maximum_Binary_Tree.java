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

        TreeNode root = recursive(nums, 0, nums.length);

        return root;
    }

    // 3,2,1,6,0,5

    /**
     * 递归建立各级节点的关系，最后返回初始节点
     * 注意边界，在left和right范围内找到最大点
     * 此处设计为左闭右开，所以在右侧遍历时需要+1,否则会重复找到最大值还是自己
     * @param nums
     * @param left
     * @param right
     * @return
     */
    private TreeNode recursive(int[] nums, int left, int right) {
        if (left >= right ) return null;

        int max_index = findMaxNumIndex(nums, left, right);
        TreeNode node = new TreeNode(nums[max_index]);
//        if (p == null) {
//            p = node;
//        }

        node.left = recursive(nums, left, max_index);
        node.right = recursive(nums, max_index+1, right);

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
        int max = nums[left], max_index = left;

        for (int i = left;i < right;i ++) {
//            max = Math.max(max, nums[i]);
            if (nums[i] > max) {
                max  = nums[i];
                max_index = i;
            }
        }

        return max_index;
    }
}
