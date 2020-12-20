package com.github.algorithm.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {
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

    private void dfs(int[] nums, int depth, int length, LinkedList<Integer> path, List<List<Integer>> res) {
        res.add(new LinkedList<>(path));
        for (int i = depth; i < length; i++) {
            path.addLast(nums[i]);
            dfs(nums, i+1, length, path, res);
            path.removeLast();
        }
    }


//    private void dfs(int[] nums, int depth, int length, LinkedList<Integer> path, List<List<Integer>> res) {
//        if (depth == length) {
//            res.add(new LinkedList<>(path));
//            return;
//        }
//
//        path.addLast(nums[depth]);
//        dfs(nums, depth+1, length, path, res);
//        path.removeLast();
//
//        dfs(nums, depth+1, length, path, res);
//    }

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        List<List<Integer>> res = subsets.subsets(new int[]{1,2,3});
        System.out.println(res);
    }
}
