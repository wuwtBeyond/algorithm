package com.github.algorithm.map;

import java.util.*;

/**
 * @author : wuwentao
 * @date : 2020/5/10
 */
public class Top_K_Frequent_Words {

    /**
     * words 属于无限，采用map+桶排序
     * @param words
     * @param k
     * @return
     */
    public List<String> topKFrequent(String[] words, int k) {
        if (words == null || words.length <= 0) return null;

        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0)+1);
        }

        Queue<Map.Entry<String, Integer>>[] arr = new Queue[words.length+1];
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            int count = frequency.get(entry.getKey());
            if (arr[count] == null) {
                arr[count] = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        String s1 = o1.getKey();
                        String s2 = o2.getKey();
                        for (int i = 0,j = 0;i < s1.length() && j < s2.length(); i ++,j ++) {
                            if (s1.charAt(i) < s2.charAt(j)) {
                                return -1;
                            }else if (s1.charAt(i) > s2.charAt(j)) {
                                return 1;
                            }
                        }

                        return s1.length()-s2.length();
                    }
                });
            }
            arr[count].add(entry);
        }

        List<String> res = new ArrayList<>();
        int j = 0;
        for (int i = arr.length-1;i >= 1;i --) {
            if (arr[i] != null) {
                while (!arr[i].isEmpty() && j++ < k) {
                    res.add(arr[i].poll().getKey());
                }
            }
        }

        return res;
    }

}
