package com.github.algorithm.str;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : wuwentao
 * @date : 2020/5/7
 */
public class Flip_Columns_For_Maximum_Number_of_EqualRows {

    /**
     * 按行比较，一致或完全不一致
     *
     * 利用0 1 计算出每行的和
     * 相同则相等，不同则加一块等于全为1的值
     *
     * @param matrix
     * @return
     */
    public int maxEqualRowsAfterFlips(int[][] matrix) {

        System.out.println(2 << 1);

        int m = matrix.length, n = matrix[0].length;
        int[] row = new int[m];
        for (int i = 0; i < m; i++) {
            int r = 0;
            for (int j = 0; j < n; j++) {
                r = (r << 1) + matrix[i][j];
            }
            row[i] = r;
        }
        boolean[] visited = new boolean[m];
        int max = 0, sum = (int) Math.pow(2, n) - 1;
        for (int i = 0; i < m; i++) {
            if (visited[i]) {
                continue;
            }
            int cnt = 0;
            for (int j = i; j < m; j++) {
                if (row[i] == row[j] || row[i] + row[j] == sum) {
                    visited[j] = true;
                    cnt++;
                }
            }
            max = Math.max(max, cnt);
        }
        return max;

//        int ans = 0;
//        int m = matrix.length, n = matrix[0].length;
//        for(int i = 0; i < m; i++) {
//            int cnt = 0;
//            int[] flip = new int[n];
//            for(int j = 0; j < n; j++) flip[j] = 1 - matrix[i][j];
//            for(int k = i; k < m; k++) {
//                if(Arrays.equals(matrix[k], matrix[i]) || Arrays.equals(matrix[k], flip)) cnt++;
//            }
//            ans = Math.max(ans, cnt);
//        }
//        return ans;

//        Map<String, Integer> map = new HashMap<>();
//        for (int[] row : matrix) {
//            StringBuilder sb1 = new StringBuilder();
//            StringBuilder sb2 = new StringBuilder();
//            for (int r : row) {
//                sb1.append(r);
//                sb2.append(1-r);
//            }
//            String str1 = sb1.toString();
//            String str2 = sb2.toString();
//
//            map.put(str1, map.getOrDefault(str1, 0)+1);
//            map.put(str2, map.getOrDefault(str2, 0)+1);
//        }
//
//        int res = 0;
//        for (int v : map.values()) {
//            res= Math.max(res, v);
//        }
//
//        return res;
    }

}
