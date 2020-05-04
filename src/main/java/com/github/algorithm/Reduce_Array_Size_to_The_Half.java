package com.github.algorithm;

import java.util.*;

/**
 * @author : wuwentao
 * @date : 2020/5/4
 */
public class Reduce_Array_Size_to_The_Half {

    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int value : map.values()) {
            list.add(value);
        }
        Collections.sort(list);

        int count = 0, res = 0;
        for (int i = list.size()-1;i >= 0;i --) {
                count += list.get(i);
                res ++;
                if (count >= arr.length/2) {
                    return res;
                }
        }

        return 0;
    }
}
