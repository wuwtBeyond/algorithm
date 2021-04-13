package com.github.algorithm.str;

public class LongestPalindrome {

    public String longestPalindrome(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        boolean[][] dp = new boolean[str.length()][str.length()];

        for (int i = 0;i < dp.length;i ++) {
            dp[i][i] = true;
        }
        int max_len = 0, begin = 0;
        for (int len = 1;len <= str.length(); len ++) {
            for (int i = 0;i < str.length();i ++) {
                int j = i + len - 1;
                if (j >= str.length()) {
                    break;
                }
                if (str.charAt(i) == str.charAt(j)) {
                    if (j-i == 1 || i == j) {
                        dp[i][j] = true;
                    } else if (dp[i+1][j-1]) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    dp[i][j] = false;
                }
                if (dp[i][j]) {
                    if (j-i+1 > max_len) {
                        max_len = j-i+1;
                        begin = i;
                    }
                }
            }
        }

        return str.substring(begin, begin+max_len);
    }

    public static void main(String[] args) {
        LongestPalindrome main = new LongestPalindrome();
        System.out.println(main.longestPalindrome("bb"));
    }
}
