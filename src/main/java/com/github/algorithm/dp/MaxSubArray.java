package com.github.algorithm.dp;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if(length <= 0) {
            return 0;
        }

        int[] dp = new int[length];
        dp[0] = nums[0];
        int res = dp[0];
        for(int i = 1;i < length;i ++) {
            dp[i] = dp[i-1] > 0 ? dp[i-1]+nums[i] : nums[i];
            res = Math.max(res, dp[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        maxSubArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}
