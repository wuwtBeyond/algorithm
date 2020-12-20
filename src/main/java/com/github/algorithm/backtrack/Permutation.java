package com.github.algorithm.backtrack;


import java.util.*;

public class Permutation {

    public String[] permutation(String s) {
        int length = s.length();
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);

        List<String> res = new LinkedList<>();
        StringBuilder path = new StringBuilder();
        boolean[] used = new boolean[length];
        dfs(sArr, 0, length, used, path, res);

        return res.toArray(new String[res.size()]);
    }

    private void dfs(char[] sArr, int depth, int length, boolean[] used, StringBuilder path, List<String> res) {
        if (depth == length) {
            res.add(new String(path));
            return;
        }
        for (int i = 0;i < length;i ++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && sArr[i] == sArr[i-1] && !used[i-1]) {
                continue;
            }

            path.append(sArr[i]);
            used[i] = true;
            dfs(sArr, depth+1, length, used, path, res);
            used[i] = false;
            path.deleteCharAt(path.length()-1);
        }
    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        String[] res = permutation.permutation("acc");
        for (String s : res) {
            System.out.println(s);
        }
    }
}
