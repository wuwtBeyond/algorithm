package com.github.algorithm;

/**
 * @author : wuwentao
 * @date : 2020/5/4
 */
public class Sum_of_Subarray_Minimums {

    /**
     * 3，1，2，4
     * 先出第一个数 3     3，1        3，1，2      3，1，2，4
     * 然后去除3  递归解决  (超时!!!)
     * @param A
     * @return
     */
    public int sumSubarrayMins(int[] A) {
        if (A == null || A.length <= 0) return 0;

        return (int)(recursiver(A, A.length-1, A[A.length-1]) % (Math.pow(10, 9)+7));
    }

    private double recursiver(int[] nums, int end, int min) {
        if (end < 0) return 0;

        int sum = nums[end];
        min = Math.min(nums[end], min);
        sum += (min * (nums.length-end-1));

        return sum + recursiver(nums, end-1, min);
    }
}
