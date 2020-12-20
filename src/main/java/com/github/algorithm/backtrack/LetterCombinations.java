package com.github.algorithm.backtrack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    private static Map<Character, char[]> map = new HashMap<>();
    static {
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<>();
        if (digits == null || digits.length() <= 0) {
            return res;
        }
        char[] arr = digits.toCharArray();
        int len = digits.length();
        StringBuilder path = new StringBuilder();
        dfs(arr, 0, len, path, res);
        return res;
    }

    private void dfs(char[] arr, int depth, int len, StringBuilder path, List<String> res) {
        if (depth == len) {
            res.add(new String(path));
            return;
        }

        char c = arr[depth];
        char[] chars = map.get(c);
        int lettersCount = chars.length;
        for (int i = 0; i < lettersCount; i++) {
            path.append(chars[i]);
            dfs(arr, depth+1, len, path, res);
            path.deleteCharAt(path.length()-1);
        }
    }

    public static void main(String[] args) {
        LetterCombinations letterCombinations = new LetterCombinations();
        List<String> res = letterCombinations.letterCombinations("23");
        System.out.println(res);
    }
}
