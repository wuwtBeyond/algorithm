package com.github.algorithm.greedy;

import java.util.Arrays;

public class FindMinArrowShots {

    public int findMinArrowShots(int[][] points) {
        if(points.length <= 0) {
            return 0;
        }

        Arrays.sort(points, (o1, o2) -> {
            if (o1[1] < o2[1]) {
                return -1;
            } else if(o1[1] > o2[1]) {
                return 1;
            } else {
                return 0;
            }
        });

        int pos = points[0][1];
        int res = 1;

        int i = 1;
        while (i < points.length) {
            while (i < points.length && points[i][0] < pos) {
                i ++;
            }

            if (i < points.length) {
                pos = points[i][1];
                res ++;
                i ++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        FindMinArrowShots findMinArrowShots = new FindMinArrowShots();
        findMinArrowShots.findMinArrowShots(new int[][]{{10, 16},{2, 8},{1, 6},{7, 12}});
    }
}