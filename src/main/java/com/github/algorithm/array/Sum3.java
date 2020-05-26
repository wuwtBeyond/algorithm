package com.github.algorithm.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : wuwentao
 * @date : 2020/5/25
 */
public class Sum3 {

    /**
     * 此题求数组中的值，与顺序无关
     * 先排序，然后为了避免取到重复的值，左边向右过滤重复，右边向左过滤重复
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0;i < nums.length-2;i ++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                int left = i+1, right = nums.length-1;
                while (left < right) {
                    if (nums[left] + nums[right] == -nums[i]) {
                        List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                        res.add(list);

                        while (left < right && nums[left] == nums[left+1]) left ++;
                        while (left < right && nums[right] == nums[right-1]) right --;
                        left ++;
                        right --;
                    }else if (nums[left] + nums[right] < -nums[i]) {
                        left ++;
                    }else {
                        right --;
                    }
                }
            }
        }

        return res;
    }
}
