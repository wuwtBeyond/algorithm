package com.github.algorithm.dp;

public class Subsequence {

    public boolean isSubsequence(String s, String t) {
        int m = s.length(), n = t.length();

        int[][] f = new int[n+1][26];
        for (int j = 0;j < 26;j ++) {
            f[n][j] = n;
        }

        for (int i = n-1;i >= 0;i --) {
            for (int j = 0;j < 26;j ++) {
                if (t.charAt(i) == j + 'a') {
                    f[i][j] = i;
                }else {
                    f[i][j] = f[i+1][j];
                }
            }
        }

        int seq = 0;
        for (int i = 0;i < m;i ++) {
            if (f[seq][s.charAt(i)-'a'] == n) {
                return false;
            }
            seq = f[seq][s.charAt(i)-'a'] + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        Subsequence subsequence = new Subsequence();
        System.out.println(subsequence.isSubsequence("abc", "ahgbdc"));
    }
}
