package com.github.algorithm.dp;

import java.util.LinkedList;
import java.util.List;

public class MinimumTotal {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] f = new int[n];
        f[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; ++i) {
            f[i] = f[i - 1] + triangle.get(i).get(i);
            for (int j = i - 1; j > 0; --j) {
                f[j] = Math.min(f[j - 1], f[j]) + triangle.get(i).get(j);
            }
            f[0] += triangle.get(i).get(0);
        }
        int minTotal = f[0];
        for (int i = 1; i < n; ++i) {
            minTotal = Math.min(minTotal, f[i]);
        }
        return minTotal;
    }

    public int minimumTotal1(List<List<Integer>> triangle) {
        if(triangle.size() <= 0) {
            return 0;
        }
        int length = triangle.size();
        int[][] dp = new int[length][length];
        dp[0][0] = triangle.get(0).get(0);
        for(int i = 1;i < length;i ++) {
            dp[i][0] = dp[i-1][0] + triangle.get(i).get(0);
        }
        for(int i = 1;i < length;i ++) {
            dp[i][i] = dp[i-1][i-1] + triangle.get(i).get(i);
        }
        int res = Math.min(dp[length-1][0], dp[length-1][length-1]);
        for(int i = 1;i < length;i ++) {
            for(int j = 1;j < i;j ++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-1]) + triangle.get(i).get(j);
            }
        }

        for (int j = 1;j < length-1;j ++) {
            res = Math.min(res, dp[length-1][j]);
        }

        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new LinkedList<>();
        LinkedList<Integer>  list1 = new LinkedList<>();
        list1.add(2);
        LinkedList<Integer>  list2 = new LinkedList<>();
        list2.add(3);
        list2.add(4);
        LinkedList<Integer>  list3 = new LinkedList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        LinkedList<Integer>  list4 = new LinkedList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);

        MinimumTotal minimumTotal = new MinimumTotal();
        minimumTotal.minimumTotal(triangle);
    }

}
