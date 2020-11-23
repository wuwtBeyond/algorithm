package com.github.algorithm.queue;

import java.util.PriorityQueue;

public class TopK {

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
        topK.getLeastNumbers(new int[]{3,2,1},2);
    }
}
