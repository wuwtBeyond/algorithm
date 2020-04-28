package com.github.algorithm;

import java.util.*;

/**
 * @author : wuwentao
 * @date : 2020/4/25
 */
public class Sort_the_Matrix_Diagonally {


    // {{3,3,1,1},{2,2,1,2},{1,1,1,2}}

    /**
     * 按斜角线把数据放入priority队列中排序，然后依次取出
     * @param mat
     * @return
     */
    public int[][] diagonalSort(int[][] mat) {
        if (mat == null || mat.length <= 1) return mat;

//        Queue<Integer> queue = new PriorityQueue((Comparator<Integer>) (o1, o2) -> {
//            if (o1 < o2) {
//                return -1;
//            }else if (o1 == o2){
//                return 0;
//            }else {
//                return 1;
//            }
//        });

        Queue<Integer> queue = new PriorityQueue<>();

        int rows = mat.length, cols = mat[0].length;

        // 从第一行开始遍历
        for (int j = 0;j < cols;j ++) {
            int p = 0, q = j;
            while (p < rows && q < cols) {
                queue.add(mat[p][q]);
                p ++;
                q ++;
            }
            p = 0;
            q = j;
            while (!queue.isEmpty()) {
                mat[p++][q++] = queue.poll();
            }
        }
        // 从第一列开始遍历
        for (int i = 1;i < mat.length;i ++) {
            int p = i, q = 0;
            while (p < rows && q < cols) {
                queue.add(mat[p][q]);
                p ++;
                q ++;
            }
            p = i;
            q = 0;
            while (!queue.isEmpty()) {
                mat[p++][q++] = queue.poll();
            }
        }

        return mat;
    }
}
