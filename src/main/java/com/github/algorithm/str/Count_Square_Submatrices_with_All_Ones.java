package com.github.algorithm.str;

/**
 * @author : wuwentao
 * @date : 2020/5/1
 */
public class Count_Square_Submatrices_with_All_Ones {

    /**
     * dp
     * 对右下角点，判断上，左分别是正方形右下角点的长度
     * @param matrix
     * @return
     */
    public int countSquares(int[][] matrix) {
        if (matrix == null || matrix[0].length <= 0) return 0;

        int res = 0;
        for (int i = 0;i < matrix.length;i ++) {
            for (int j = 0;j < matrix[0].length; j ++) {
                if (matrix[i][j] == 1 && i > 0 && j > 0) {
                    matrix[i][j] = Math.min(matrix[i-1][j-1], Math.min(matrix[i-1][j], matrix[i][j-1])) + 1;
                }
                res += matrix[i][j];
            }
        }

        return res;
    }
}
