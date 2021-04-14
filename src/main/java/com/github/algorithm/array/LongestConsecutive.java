package com.github.algorithm.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max_length = 0;
        for (int num : set) {
            if (!set.contains(num-1)) {
                int target = num, length = 0;
                while (set.contains(target)) {
                    length += 1;
                    target += 1;
                }
                max_length = Math.max(max_length, length);
            }
        }

        return max_length;
    }

}
