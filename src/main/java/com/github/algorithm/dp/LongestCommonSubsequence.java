package com.github.algorithm.dp;


public class LongestCommonSubsequence {

    /**
     * dp[i][j]  表示 s[0。。。i] t[0.。。j] 的最长公共子序列长度
     * @param s
     * @param t
     * @return
     */
    public int longestCommonSubsequence(String s, String t) {
        if (s == null || s.length() <= 0 || t == null || t.length() <= 0) {
            return 0;
        }

        int m = s.length(), n = t.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }

}
