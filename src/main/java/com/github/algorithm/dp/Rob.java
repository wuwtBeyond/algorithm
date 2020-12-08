package com.github.algorithm.dp;

public class Rob {


    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        return Math.max(rob3(nums, 1, nums.length), rob3(nums, 0, nums.length-1));
    }

    public int rob3(int[] nums, int begin, int end) {
        if (end - begin <= 0) {
            return 0;
        }
        if (end == begin+1) {
            return nums[begin];
        }
        int pre2 = nums[begin];
        int pre1 = Math.max(nums[begin], nums[begin+1]);
        int cur = pre1;
        for (int i = begin+2;i < end;i ++) {
            cur = Math.max(pre2+nums[i], pre1);
            pre2 = pre1;
            pre1 = cur;
        }

        return cur;
    }

    /**
     * dp[i] 表示从开始偷到第i家的最大金额
     * 偷i  dp[i] = max(dp[i-1], dp[i-2] + nums[i])
     * 不偷i dp[i] = dp[i-1]
     * dp[0]=nums[0]
     * dp[1]=max(nums[0],nums[1])
     * @param nums
     * @return
     */
    public int rob2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2;i < nums.length;i ++) {
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }

        return dp[nums.length-1];
    }


    public static void main(String[] args) {
        Rob rob = new Rob();
//        rob.rob(new int[]{2,7,9,3,1});
        System.out.println(rob.rob(new int[]{1}));
    }
}
