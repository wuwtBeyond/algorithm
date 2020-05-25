package com.github.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wuwentao
 * @date : 2020/5/25
 */
public class TwoSum {

    /**
     * 题意说明有且仅有一个答案，则用map key存放值， value存放下标，匹配成功返回即可
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] res = new int[2];
        for (int i = 0;i < nums.length;i ++) {
            if (map.containsKey(target-nums[i])) {
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }

        return res;
    }
}
