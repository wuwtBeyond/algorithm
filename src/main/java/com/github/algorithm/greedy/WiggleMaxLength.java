package com.github.algorithm.greedy;

public class WiggleMaxLength {

    public int wiggleMaxLength(int[] nums) {
        if(nums.length < 2) {
            return nums.length;
        }

        int pre = nums[1] - nums[0];
        int res = pre != 0 ? 2 : 1;
        for(int i = 2;i < nums.length;i ++) {
            int cur = nums[i] - nums[i-1];
            if((pre >= 0 && cur < 0) || (pre <= 0 && cur > 0)) {
                res ++;
                pre = cur;
            }
        }

        return res;
    }

}
