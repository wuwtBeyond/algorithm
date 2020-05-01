package com.github.algorithm;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author : wuwentao
 * @date : 2020/4/28
 */
public class Minimum_Number_of_Steps_to_Make_Two_Strings_Anagram {

    /**
     * 对于有限集合，采用数组代替集合类
     * @param s
     * @param t
     * @return
     */
    public int minSteps(String s, String t) {
        if (s == null || s.length() <= 0) return 0;

        int[] counts = new int[26];

        for (int i = 0;i < s.length();i ++) {
            counts[s.charAt(i)-'a'] ++;
            counts[t.charAt(i)-'a'] --;
        }

        int steps = 0;
        for (int count : counts) {
            steps += Math.abs(count);
        }

        return steps/2;
//        List<Character> anagram = new ArrayList<>();
//        for (int i = 0;i < s.length();i ++) {
//            anagram.add(s.charAt(i));
//        }
//
//        for (int i = 0;i < t.length();i ++) {
//            if (anagram.contains(new Character(t.charAt(i)))) {
//                anagram.remove(new Character(t.charAt(i)));
//            }else {
//                anagram.add(t.charAt(i));
//            }
//        }
//
//        return anagram.size()/2;
    }
}
