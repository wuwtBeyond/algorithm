package com.github.algorithm;

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

        int[] left = new int[2];
        int[] right = new int[2];

        for (int i = 1;i < rating.length-1;i ++) {

        }

        return 0;
    }
}
