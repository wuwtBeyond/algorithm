package com.github.algorithm.backtrack;

import java.util.LinkedList;
import java.util.List;

public class Permute {

    /**
     * 没有重复数字
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        if (nums == null || nums.length <= 0) {
            return new LinkedList<>();
        }

        int length = nums.length;
        LinkedList<Integer> path = new LinkedList<>();
        boolean[] used = new boolean[length];
        dfs(nums, 0, length, path, used, res);

        return res;
    }

    private void dfs(int[] nums, int depth, int length, LinkedList<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth == length) {
            res.add(new LinkedList<>(path));
            return;
        }

        for (int i = 0;i < length;i ++) {
            if (!used[i]) {
                path.addLast(nums[i]);
                used[i] = true;
                dfs(nums, depth+1, length, path, used, res);
                used[i] = false;
                path.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        Permute permute = new Permute();
        List<List<Integer>> res = permute.permute(new int[]{1,2,3});
        System.out.println(res);
    }
}