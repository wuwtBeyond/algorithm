package com.github.algorithm;

/**
 * @author : wuwentao
 * @date : 2020/4/18
 */
public class Max_Increase_to_Keep_City_Skyline {

    /**
     * 找到正面看和侧面看的高度数组，然后取各点的最小值
     * 优化PS:一次遍历得到rows和cols的值
     * @param grid
     * @return
     */
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if (grid == null || grid.length <= 0)  return 0;

        int[] rows = new int[grid.length];
        int[] cols = new int[grid[0].length];

        for (int i = 0;i < grid.length;i ++) {
            for (int j = 0;j < grid[i].length;j ++) {
//                if (grid[i][j] > rows[i]) {
//                    rows[i] = grid[i][j];
//                }
                rows[i] = Math.max(grid[i][j], rows[i]);
//                if (grid[i][j] > cols[j]) {
//                    cols[j] = grid[i][j];
//                }
                cols[j] = Math.max(grid[i][j], cols[j]);
            }
        }

//        for (int j = 0;j < grid[0].length;j ++) {
//            for (int i = 0;i < grid.length;i ++) {
//                if (grid[i][j] > cols[j]) {
//                    cols[j] = grid[i][j];
//                }
//            }
//        }

        int sum = 0;
        for (int i = 0;i < rows.length; i ++) {
            for (int j = 0;j < cols.length;j ++) {
                int height = Math.min(rows[i],cols[j]);
                sum += (height-grid[i][j]);
            }
        }

        return sum;
    }
}
