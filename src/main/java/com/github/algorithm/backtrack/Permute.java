package com.github.algorithm.backtrack;

import java.util.LinkedList;
import java.util.List;

public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return new LinkedList<>();
        }

        int length = nums.length;
        List<List<Integer>> res = new LinkedList<>();
        boolean[] used = new boolean[length];
        dfs(nums, 0, length, used, new LinkedList<Integer>(), res);

        return res;
    }

    private void dfs(int[] nums, int depth, int length, boolean[] used, LinkedList<Integer> path, List<List<Integer>> res) {
        if (depth == length) {
            res.add(new LinkedList<>(path));
            return;
        }

        for (int i = 0;i < length;i ++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, depth+1, length, used, path, res);
                path.removeLast();
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Permute permute = new Permute();
        List<List<Integer>> res = permute.permute(new int[]{1,2,3});
        System.out.println(res);
    }
}
