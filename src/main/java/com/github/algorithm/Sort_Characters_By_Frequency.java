package com.github.algorithm;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author : wuwentao
 * @date : 2020/5/9
 */
public class Sort_Characters_By_Frequency {

    /**
     * 桶排序及map排序各来实现一次
     * @param s
     * @return
     */
//    public String frequencySort(String s) {
//        if (s == null || s.length() <= 1) return s;
//
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (Character c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0)+1);
//        }
//
//
//
//        return null;
//    }

    /**
     * 桶排序优化  字符属于有限集合，用数组代替map，搜集key及key出现的次数
     * @param s
     * @return
     */
    public String frequencySort(String s) {
        if (s == null || s.length() <= 1) return s;

        char[] frequency = new char[128];
        for (char c : s.toCharArray()) {
            frequency[c] ++;
        }

        List<Character>[] frequency_list = new List[s.length()+1];
        for (int i = frequency.length-1;i >= 0;i --) {
            if (frequency[i] > 0) {
                if (frequency_list[frequency[i]] == null) {
                    frequency_list[frequency[i]] = new ArrayList<>();
                }
                frequency_list[frequency[i]].add(new Character((char)i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = frequency_list.length-1;i >= 1;i --) {
            if (frequency_list[i] != null) {
                for (Character c : frequency_list[i]) {
                    int j = i;
                    while (j-- > 0) {
                        sb.append(c);
                    }
                }
            }
        }


        return sb.toString();
    }


    /**
     * 桶排序
     * @param s
     * @return
     */
//    public String frequencySort(String s) {
//        if (s == null || s.length() <= 1) return s;
//
//        Map<Character, Integer> map = new HashMap<>();
//        for (Character c : s.toCharArray()) {
//            map.put(c , map.getOrDefault(c, 0)+1);
//        }
//
//        List<Character>[] buckets = new ArrayList[s.length()+1];
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (buckets[entry.getValue()] == null) {
//                buckets[entry.getValue()] = new ArrayList<>();
//            }
//            buckets[entry.getValue()].add(entry.getKey());
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = buckets.length-1;i >= 1;i --) {
//            if (buckets[i] != null) {
//                for (int j = 0;j < buckets[i].size();j ++) {
//                    char c = buckets[i].get(j);
//                    int k = i;
//                    while (k-- > 0) {
//                        sb.append(c);
//                    }
//                }
//            }
//        }
//
//        return sb.toString();
//    }


    /**
     * map 值排序
     * @param s
     * @return
     */
//    public String frequencySort(String s) {
//        if (s == null || s.length() <= 1) return s;
//        Map<Character, Integer> map = new HashMap<>();
//        for (Character c : s.toCharArray()) {
//            map.put(c , map.getOrDefault(c, 0)+1);
//        }
//
//        CQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
//                return o2.getValue()-o1.getValue();
//            }
//        });
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            queue.add(entry);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        while (!queue.isEmpty()) {
//            Map.Entry<Character, Integer> entry = queue.poll();
//
//            Character c = entry.getKey();
//            Integer counts = entry.getValue();
//            while (counts-- > 0) {
//                sb.append(c);
//            }
//        }
//
//        return sb.toString();
//    }

}
