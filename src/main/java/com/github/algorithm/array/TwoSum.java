package com.github.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wuwentao
 * @date : 2020/5/25
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapping = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!mapping.containsKey(target-nums[i])) {
                mapping.put(nums[i], i);
            } else {
                int[] res = new int[2];
                res[0] = mapping.get(target-nums[i]);
                res[1] = i;
                return res;
            }
        }

        return null;
    }
}
