package com.github.algorithm.queue;

import java.net.URLEncoder;
import java.util.PriorityQueue;
import java.util.Random;

public class TopK {

    /**
     * 快速排序 思想
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers2(int[] arr, int k) {
        randomizedSelected(arr, 0, arr.length - 1, k);
        int[] vec = new int[k];
        for (int i = 0; i < k; ++i) {
            vec[i] = arr[i];
        }
        return vec;
    }

    public void randomizedSelected(int[] arr, int l, int r, int k) {
        if (l >= r) {
            return;
        }
        int pos = randomizedPartition(arr, l, r);
        int num = pos - l + 1;
        if (k == num) {
            return;
        } else if (k < num) {
            randomizedSelected(arr, l, pos - 1, k);
        } else {
            randomizedSelected(arr, pos + 1, r, k - num);
        }
    }

    // 基于随机的划分
    public int randomizedPartition(int[] nums, int l, int r) {
        int i = new Random().nextInt(r - l + 1) + l;
        swap(nums, r, i);
        return partition(nums, l, r);
    }

    public int partition(int[] nums, int l, int r) {
        int pivot = nums[r];
        int i = l - 1;
        for (int j = l; j <= r - 1; ++j) {
            if (nums[j] <= pivot) {
                i = i + 1;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, r);
        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * 堆排序 思想
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k <= 0) {
            return new int[0];
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int i = 0;i < k; i ++) {
            queue.add(arr[i]);
        }

        for (int i = k;i < arr.length;i ++) {
            if (arr[i] < queue.peek()) {
                queue.poll();
                queue.add(arr[i]);
            }
        }

        int[] res = new int[k];
        int i = 0;
        while (!queue.isEmpty()) {
            res[i ++] = queue.poll();
        }

        return res;
    }

    public static void main(String[] args) {
        TopK topK = new TopK();
//        topK.getLeastNumbers2(new int[]{0,1,2,1},1);
//        int[] nums = topK.getLeastNumbers2(new int[]{0,1,1,1,4,5,3,7,7,8,10,2,7,8,0,5,2,16,12,1,19,15,5,18,2,2,22,15,8,22,17,6,22,6,22,26,32,8,10,11,2,26,9,12,9,7,28,33,20,7,2,17,44,3,52,27,2,23,19,56,56,58,36,31,1,19,19,6,65,49,27,63,29,1,69,47,56,61,40,43,10,71,60,66,42,44,10,12,83,69,73,2,65,93,92,47,35,39,13,75}, 75);
//        for (int num : nums) {
//            System.out.println(num);
//        }
        String url="http://192.168.0.19:8888/cas/login";
        String urlEncodee= URLEncoder.encode(url);
        System.out.println(urlEncodee);
    }
}
