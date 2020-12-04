package com.github.algorithm.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class EraseOverlapIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length <= 0) {
            return intervals.length;
        }

        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int count = 1;
        int end =  intervals[0][1];
        for(int[] interval : intervals) {
            int start =  interval[0];
            if(start >= end) {
                count ++;
                end = interval[1];
            }
        }

        return intervals.length - count;
    }

    public static void main(String[] args) {
        EraseOverlapIntervals eraseOverlapIntervals = new EraseOverlapIntervals();
        eraseOverlapIntervals.eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}});
    }
}
