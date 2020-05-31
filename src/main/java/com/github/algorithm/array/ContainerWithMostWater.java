package com.github.algorithm.array;

/**
 * @author : wuwentao
 * @date : 2020/5/31
 */
public class ContainerWithMostWater {

    /**
     * 移动两边中较小的那条边向里面挪，比较每次的最大值并更新
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;

        int maxArea = Integer.MIN_VALUE;
        while (left < right) {
            maxArea = Math.max(maxArea, (right-left)*Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left ++;
            }else {
                right --;
            }
        }

        return maxArea;
    }

}
