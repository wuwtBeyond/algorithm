package com.github.algorithm.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubsetsUnique {
    /**
     * 返回集合所有子集
     * 不包含重复元素
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length <= 0) {
            return res;
        }
        int length = nums.length;
        dfs(nums, 0, length, new LinkedList<Integer>(), res);

        return res;
    }

    private void dfs(int[] nums, int index, int length, LinkedList<Integer> path, List<List<Integer>> res) {
        res.add(new LinkedList<>(path));
        for (int i = index; i < length; i++) {
            if (i > 0 && i != index && nums[i] == nums[i-1]) {
                continue;
            }
            path.addLast(nums[i]);
            dfs(nums, i+1, length, path, res);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        SubsetsUnique subsets = new SubsetsUnique();
        List<List<Integer>> res = subsets.subsets(new int[]{1,2,2,2});
        System.out.println(res);
    }
}
