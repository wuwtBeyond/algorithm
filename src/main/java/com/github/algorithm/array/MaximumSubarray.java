package com.github.algorithm.array;

/**
 * @author : wuwentao
 * @date : 2020/5/27
 */
public class MaximumSubarray {

    /**
     * 最大子数组和
     * 遍历一遍，每到一个数，计算当前数和之前最大和的和，与当前数进行比较
     * 如果当前和比当前数还要小，则肯定取当前数作为当前最大值
     * 考虑全负数情况
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int maxCur = nums[0], maxRes = nums[0];
        for (int i = 1;i < nums.length;i ++) {
            maxCur = Math.max(nums[i], maxCur+nums[i]);
            maxRes = Math.max(maxRes, maxCur);
        }

        return maxRes;
    }
}
