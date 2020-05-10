package com.github.algorithm;

import java.util.*;

/**
 * @author : wuwentao
 * @date : 2020/5/10
 */
public class Top_K_Frequent_Elements {

    /**
     * 次优解
     * @param nums
     * @param k
     * @return
     */
//    public int[] topKFrequent(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0)+1);
//        }
//
//        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o2.getValue()-o1.getValue();
//            }
//        });
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            queue.add(entry);
//        }
//
//        int[] res = new int[k];
//        int i = 0;
//        while (!queue.isEmpty() && i < k) {
//            res[i ++] = queue.poll().getKey();
//        }
//
//        return res;
//    }

    /**
     * 搜集每个key和每个key出现的次数  如果key值有限，优先考虑数组
     *                              如果key值无线，优先考虑map
     * 最优解
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] res = new int[k];
        for (int pos = bucket.length - 1, i = 0; pos >= 0 && i < k; pos--) {
            if (bucket[pos] != null) {
                for (Integer num : bucket[pos]) {
                    res[i ++] = num;
                }
            }
        }

        return res;
    }
}
