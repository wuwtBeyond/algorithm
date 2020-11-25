package com.github.algorithm.queue;

import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2- o1);

        for (int stone : stones) {
            priorityQueue.add(stone);
        }

        while (priorityQueue.size() > 1) {
            int s1 = priorityQueue.poll();
            int s2 = priorityQueue.poll();
            if (s1 != s2) {
                priorityQueue.add(s1 - s2 > 0 ? s1-s2 : s2-s1);
            }
        }

        if (!priorityQueue.isEmpty()) {
            return 0;
        }

        return priorityQueue.poll();
    }

    public static void main(String[] args) {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        System.out.println(lastStoneWeight.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }

}
