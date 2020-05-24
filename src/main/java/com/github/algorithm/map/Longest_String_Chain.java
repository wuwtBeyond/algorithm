package com.github.algorithm.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : wuwentao
 * @date : 2020/5/13
 */
public class Longest_String_Chain {

    /**
     * dp 先按字符串长度排序，然后遍历，每一个字符串去除一个字符后计算出现次数放入map中，遍历到最后，最大值即为所求
     * Input: ["a","b","ba","bca","bda","bdca"]
     * Output: 4
     * Explanation: one of the longest word chain is "a","ba","bda","bdca".
     * @param words
     * @return
     */
    public int longestStrChain(String[] words) {
        Map<String, Integer> dp = new HashMap<>();
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int res = 0;
        for (String word : words) {
            int best = 0;
            for (int i = 0; i < word.length(); ++i) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                best = Math.max(best, dp.getOrDefault(prev, 0) + 1);
            }
            dp.put(word, best);
            res = Math.max(res, best);
        }
        return res;
    }
}
