package com.github.algorithm.str;

/**
 * @author : wuwentao
 * @date : 2020/4/19
 */
public class Count_Number_of_Teams {

    /**
     * left 0 代表左边比当前值小的数量
     *      1 代表左边比当前值大的数量
     * right 同上
     * @param rating
     * @return
     */
    public int numTeams(int[] rating) {
        if (rating == null || rating.length < 3) return 0;

        int sum = 0;

        for (int i = 1;i < rating.length-1;i ++) {
            int[] left = new int[2];
            int[] right = new int[2];

            for (int j = 0;j < rating.length;j ++) {
                if (rating[j] > rating[i]) {
                    if (j > i) {
                        right[1] ++;
                    }
                    if (j < i) {
                        left[1] ++;
                    }
                }
                if (rating[j] < rating[i]) {
                    if (j > i) {
                        right[0] ++;
                    }
                    if (j < i) {
                        left[0] ++;
                    }
                }
            }

            sum += (left[0]*right[1] + left[1]*right[0]);
        }

        return sum;
    }
}
