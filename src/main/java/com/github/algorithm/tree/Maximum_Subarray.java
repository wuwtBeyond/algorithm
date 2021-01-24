package com.github.algorithm.tree;

/**
 * @author : wuwentao
 * @date : 2020/5/5
 */
public class Maximum_Subarray {

    /**
     * 一定从正数开始
     * 累加到小于0或小于当前值 退出
     *
     * 更新:
     * dp[i] 代表以nums[i]结尾的最大子数组
     *
     * dp[i] = dp[i-1] > 0 ? dp[i-1]+nums[i] : nums[i]
     *
     * -2,1,-3,4,-1,2,1,-5,4
     *
     * 更新：不需要新创建动归标记数组
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int max = nums[0];

        for (int i = 1;i < nums.length;i ++) {
            nums[i] = nums[i-1] > 0 ? nums[i-1]+nums[i] : nums[i];
            max = Math.max(max, nums[i]);
        }

        return max;
    }
}
