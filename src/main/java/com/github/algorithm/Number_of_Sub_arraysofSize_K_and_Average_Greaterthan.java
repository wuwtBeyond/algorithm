package com.github.algorithm;

/**
 * @author : wuwentao
 * @date : 2020/5/4
 */
public class Number_of_Sub_arraysofSize_K_and_Average_Greaterthan {

    /**
     * 滑动窗口，并实时比较
     * @param arr
     * @param k
     * @param threshold
     * @return
     */
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, counts = 0;
        for (int i = 0;i < arr.length;i ++) {
            if (i < k-1) {
                sum += arr[i];
                continue;
            }
            sum += arr[i];
            if (sum >= threshold*k) {
                counts ++;
            }
            sum -= arr[i-k+1];
        }

        return counts;
    }
}
