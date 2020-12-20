package com.github.algorithm.backtrack;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(candidates);
        int len = candidates.length;
        LinkedList<Integer> path = new LinkedList<>();
        dfs(candidates, 0, len, target,  path, res);

        return res;
    }

    private void dfs(int[] candidates, int index, int len, int target, LinkedList<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new LinkedList<>(path));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < len; i++) {
            path.addLast(candidates[i]);
            dfs(candidates, i, len, target-candidates[i], path, res);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> res = combinationSum.combinationSum(new int[]{2,3,5}, 8);
        System.out.println(res);
    }
}
