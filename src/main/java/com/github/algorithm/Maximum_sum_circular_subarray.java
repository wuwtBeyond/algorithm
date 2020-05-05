package com.github.algorithm;

/**
 * @author : wuwentao
 * @date : 2020/5/6
 */
public class Maximum_sum_circular_subarray {

    /**
     * 通过分析，最优解是比较两者的最大值
     * 1，最大连续子数组的和
     * 2，总和减去最小连续子数组的和
     *
     * 对于全为负数情况，判断max是否大于0
     *
     * 最大: dp[i] = dp[i-1] > 0 ? dp[i-1]+nums[i] : nums[i]
     * 最小: dp[i] = dp[i-1] < 0 ? dp[i-1]+nums[i] : nums[i]
     *
     * -2,1,-3,4,-1,2,1,-5,4
     * @param nums
     * @return
     */
    public int maxSubarraySumCircular(int[] nums) {
        int min = nums[0], max = nums[0];

        int cur_min = nums[0], cur_max = nums[0], sum = nums[0];

        for (int i = 1;i < nums.length;i ++) {
            cur_min = cur_min < 0 ? cur_min+nums[i] : nums[i];
            cur_max = cur_max > 0 ? cur_max+nums[i] : nums[i];

            min = Math.min(min, cur_min);
            max = Math.max(max, cur_max);

            sum += nums[i];
        }

        return max > 0 ? Math.max(max, sum-min) : max;
    }
}
