package com.github.algorithm.dp;

public class LCS {

    public String LCS (String str1, String str2) {
        // write code here
        if(str1 == null || str1.length() <= 0 || str2 == null || str2.length() <= 0) {
            return "-1";
        }

        int m = str1.length(), n = str2.length();
        int[][] dp = new int[m+1][n+1];
        int max = 0, end = -1;
        for(int i = 1;i < m+1;i ++) {
            for(int j = 1;j < n+1;j ++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                if (dp[i][j] > max) {
                    max = dp[i][j];
                    end = j;
                }
            }
        }
        if (end == -1) {
            return "-1";
        } else {
            return str2.substring(end-max,end);
        }
    }
}
