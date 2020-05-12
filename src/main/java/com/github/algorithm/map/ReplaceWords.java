package com.github.algorithm.map;

import java.util.List;

/**
 * 字典树经典解法
 * 前缀匹配
 * @author : wuwentao
 * @date : 2020/5/12
 */
public class ReplaceWords {

    private Trie root;

    /**
     * 前缀树
     * @param dict
     * @param sentence
     * @return
     */
    public String replaceWords(List<String> dict, String sentence) {
        root = buildTireTree(dict);

        String[] tokens = sentence.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String token : tokens) {
            sb.append(findShortestReplacement(token));
            sb.append(" ");
        }

        return sb.substring(0, sb.length()-1);
    }

    private String findShortestReplacement(String token) {
        Trie temp = root;

        StringBuilder sb = new StringBuilder();
        for (char c : token.toCharArray()) {
           sb.append(c);
           if (temp.children[c-'a'] != null) {
               if (temp.children[c-'a'].is_word) {
                   return sb.toString();
               }
               temp = temp.children[c-'a'];
           }else {
               return token;
           }
        }

        return token;
    }

    private Trie buildTireTree(List<String> dict) {
        root = new Trie('_');
        for (String word: dict) {
            Trie temp = root;
            for (char c : word.toCharArray()) {
                if (temp.children[c-'a'] == null) {
                    temp.children[c-'a'] = new Trie(c);
                }
                temp = temp.children[c-'a'];
            }
            temp.is_word = true;
        }

        return root;
    }


    class Trie {
        char c;
        Trie[] children;
        boolean is_word;

        public Trie(char c) {
            this.c = c;
            this.children = new Trie[26];
            this.is_word = false;
        }
    }
}
