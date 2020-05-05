package com.github.algorithm;

import java.util.Stack;

/**
 * @author : wuwentao
 * @date : 2020/5/4
 */
public class Sum_of_Subarray_Minimums {

    /**
     * 没看懂，头疼
     * todo
     * @param A
     * @return
     */
    public int sumSubarrayMins(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int n = A.length, res = 0, mod = (int)1e9 + 7, j,k;
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && A[stack.peek()] > (i == n ? 0 : A[i])) {
                j = stack.pop();
                k = stack.isEmpty() ? -1 : stack.peek();
                res = (res + A[j] * (i - j) * (j - k)) % mod;
            }
            stack.push(i);
        }
        return res;
    }


    /**
     * 取每个点，左右方向小于等于该点的数量（包括该点），然后相乘 得以该点为最小值子数组的数量
     * 当存在相同的数时，使任意一方带上= 实现不漏算，不重算
     * @param nums
     * @return
     */
//    public int sumSubarrayMins(int[] nums) {
//        if (nums == null) return 0;
//
//        Stack<int[]> stack = new Stack<>();
//        // 从左向右，记录该点左边数量
//        int[] left_count = new int[nums.length];
//        for (int i = 0;i < nums.length;i ++) {
//            int count = 1;
//            while (!stack.isEmpty() && stack.peek()[0] > nums[i]) {
//                int[] temp = stack.pop();
//                count += temp[1];
//            }
//            stack.push(new int[]{nums[i], count});
//            left_count[i] = count;
//        }
//
//        stack.clear();
//
//        // 从右向左，记录该点右边数量
//        int[] right_count = new int[nums.length];
//        for (int i = nums.length-1;i >= 0;i --) {
//            int count = 1;
//            while (!stack.isEmpty() && stack.peek()[0] >= nums[i]) {
//                int[] temp = stack.pop();
//                count += temp[1];
//            }
//            stack.push(new int[]{nums[i], count});
//            right_count[i] = count;
//        }
//
//        int res = 0, mod = (int)1e9 + 7;
//        for (int i = 0;i < nums.length;i ++) {
//            res =  (res + nums[i]*left_count[i]*right_count[i]) % mod;
//        }
//
//        return res;
//    }


    /**
     * 3，1，2，4
     * 先出第一个数 3     3，1        3，1，2      3，1，2，4
     * 然后去除3  递归解决
     * 结果不对，没有考虑到以下情况
     * 假设此时到1
     * 4 2 1   取不到   1  2
     * @param A
     * @return
     */
//    public int sumSubarrayMins(int[] A) {
//        if (A == null || A.length <= 0) return 0;
//
//        return (int)(recursiver(A, A.length-1, A[A.length-1]) % (Math.pow(10, 9)+7));
//    }
//
//    private double recursiver(int[] nums, int end, int min) {
//        if (end < 0) return 0;
//
//        int sum = nums[end];
//        min = Math.min(nums[end], min);
//        sum += (min * (nums.length-end-1));
//
//        return sum + recursiver(nums, end-1, min);
//    }
}
