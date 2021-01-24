package com.github.algorithm.dp;


public class FindLength {

    /**
     * 动态规划
     * dp[i][j] =
     * s[i] == t[j] dp[i-1][j-1]+1
     * s[i] != t[j] 0
     * max(dp[i][j], max);
     * @param s
     * @param t
     * @return
     */
    public int findLength(int[] s, int[] t) {
        if (s == null || s.length <= 0 || t == null || t.length <= 0) {
            return 0;
        }

        int res = 0;
        int m = s.length, n = t.length;
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (s[i-1] == t[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                res = Math.max(res, dp[i][j]);
            }
        }

        return res;
    }



}

