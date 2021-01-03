package com.github.algorithm.array;

public class Trap {

    /**
     * 先计算每一个坑可接雨水的最大高度
     * @param height
     * @return
     */
    public int trap(int[] height) {
        if (height == null || height.length <= 0) {
            return 0;
        }

        int length = height.length;
        int[] left = new int[length];
        int[] right = new int[length];

        int left_max = 0;
        for (int i = 0;i < length;i ++) {
            if (i == 0) {
                left[i] = 0;
                left_max = height[i];
            } else {
                left_max = Math.max(height[i], left_max);
                left[i] = left_max;
            }
        }

        int right_max = 0;
        for (int i = length-1;i >= 0;i --) {
            if (i == 0) {
                right[i] = 0;
                right_max = height[i];
            } else {
                right_max = Math.max(height[i], right_max);
                right[i] = right_max;
            }
        }

        int res = 0;
        for (int i = 0;i < length;i ++) {
            int max = Math.min(left[i], right[i]);
            res += height[i] < max ? max-height[i] : 0;
        }

        return res;
    }

    public static void main(String[] args) {
        Trap trap = new Trap();
        trap.trap(new int[]{4,2,0,3,2,5});
    }
}

