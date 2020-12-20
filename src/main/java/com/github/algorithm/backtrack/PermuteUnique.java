package com.github.algorithm.backtrack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);

        int length = nums.length;
        boolean[] used = new boolean[length];
        LinkedList<Integer> path = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        dfs(nums, 0, length, used, path, res);

        return res;
    }

    private void dfs(int[] nums, int depth, int length, boolean[] used, LinkedList<Integer> path, List<List<Integer>> res) {
        if (depth == length) {
            return;
        }
        for (int i = 0;i < length;i ++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) {
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, depth+1, length, used, path, res);
            used[i] = false;
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        PermuteUnique permuteUnique = new PermuteUnique();
        List<List<Integer>> res =permuteUnique.permuteUnique(new int[]{1,2,2});
        System.out.println(res);
    }

}
