package com.github.algorithm.greedy;

import java.util.LinkedList;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        int[] last = new int[S.length()];
        for(int i = 0;i < S.length();i ++) {
            last[S.charAt(i)-'a'] = i;
        }

        int start = 0, end = 0, it = start;
        List<Integer> res = new LinkedList<>();
        while(it < S.length()) {
            end = Math.max(end, last[S.charAt(it)-'a']);
            if(it == end) {
                res.add(end-start+1);
                start = end+1;
            }
            it ++;
        }

        return res;
    }

    public static void main(String[] args) {
        PartitionLabels partitionLabels = new PartitionLabels();
        partitionLabels.partitionLabels("ababcbacadefegdehijhklij");
    }

}
