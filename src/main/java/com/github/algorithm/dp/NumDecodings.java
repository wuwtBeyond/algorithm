package com.github.algorithm.dp;

public class NumDecodings {

    /**
     * dp[i] 从0到i的解码数量
     * c[i] = 0
     *      c[i-1] = 1 | 2 dp[i] = dp[i-2]
     *      否则 return 0
     * c[i] != 0
     *      c[i-1] = 1 || (c[i-1] = 2 && c[i] <= 6) dp[i] = dp[i-1] + dp[i-2]
     *      c[i-1] = 0 dp[i] = dp[i-1]
     *      否则 dp[i] = dp[i-1]
     * @param s
     * @return
     */
    public int numDecodings(String s) {
        if (s == null || s.length() <= 0) {
            return 0;
        }

        if (s.charAt(0) == '0') {
            return 0;
        }

        char[] num = s.toCharArray();
        int length = s.length();
        int[] dp = new int[length+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2;i < dp.length;i ++) {
            if (num[i-1] == '0') {
                if (num[i-2] == '1' || num[i-2] == '2') {
                    dp[i] = dp[i-2];
                }else {
                    return 0;
                }
            } else {
                if (num[i-2] == '1' || (num[i-2] == '2' && num[i-1] <= '6')) {
                    dp[i] = dp[i-1] + dp[i-2];
                } else {
                    dp[i] = dp[i-1];
                }
            }
        }

        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        NumDecodings numDecodings = new NumDecodings();
        int res = numDecodings.numDecodings("01");
        System.out.println(res);
    }
}
