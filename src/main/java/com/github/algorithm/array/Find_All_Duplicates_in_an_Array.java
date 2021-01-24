package com.github.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : wuwentao
 * @date : 2020/5/4
 */
public class Find_All_Duplicates_in_an_Array {

    /**
     * 将前一位置为负，判断为负则出现两次
     * 到这一位的时候取绝对值，不影响正常使用
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length <= 1) return res;

        for (int i = 0;i < nums.length;i ++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                res.add(index+1);
            }
            nums[index] = -nums[index];
        }

        return res;
    }

    /**
     * 使用o(n)空间复杂度,不符合题意
     */
//    public List<Integer> findDuplicates(int[] nums) {
//        List<Integer> res = new ArrayList<>();
//        if (nums == null || nums.length <= 1) return res;
//        int[] counts = new int[nums.length+1];
//        for (int num : nums) {
//            counts[num] ++;
//            if (counts[num] == 2) {
//                res.add(num);
//            }
//        }
//
//        return res;
//    }
}
