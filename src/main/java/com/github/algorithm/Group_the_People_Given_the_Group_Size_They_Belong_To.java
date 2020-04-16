package com.github.algorithm;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : wuwentao
 * @date : 2020/4/15
 */
public class Group_the_People_Given_the_Group_Size_They_Belong_To {

    /**
     * map存放关系，当发现满了，放入结果集，删除key
     * map中应边存边比较，一次过
     * @param groupSizes
     * @return
     */
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        if (groupSizes == null || groupSizes.length <= 0) {
            return res;
        }
        Map<Integer,List<Integer>> map = new HashMap<>();

        for (int i = 0;i < groupSizes.length;i ++) {
            List<Integer> list = map.getOrDefault(groupSizes[i], new ArrayList<>());
            list.add(i);
            map.put(groupSizes[i], list);
            if (list.size() >= groupSizes[i]) {
                res.add(list);
                map.remove(groupSizes[i]);
            }
        }

        return res;

//        for (int i = 0;i < groupSizes.length;i ++) {
//            if (groupSizes[i] == 1) {
//                List<Integer> list = new ArrayList<>();
//                list.add(i);
//                res.add(list);
//                continue;
//            }
//
//            if (map.containsKey(groupSizes[i])) {
//                map.get(groupSizes[i]).add(i);
//                if (map.get(groupSizes[i]).size() >= groupSizes[i]) {
//                    res.add(map.get(groupSizes[i]));
//                    map.remove(groupSizes[i]);
//                }
//            }else {
//                List<Integer> list = new ArrayList<>();
//                list.add(i);
//                map.put(groupSizes[i], list);
//            }
//        }
//
//        for (List<Integer> list : map.values()) {
//            res.add(list);
//        }

//        return res;
    }
}
