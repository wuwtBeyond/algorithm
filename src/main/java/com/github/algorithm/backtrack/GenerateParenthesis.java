package com.github.algorithm.backtrack;

import java.util.LinkedList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<>();
        if (n <= 0) {
            return res;
        }
        StringBuilder path = new StringBuilder();
        dfs(0, n*2, 0, 0, path, res);
        return res;
    }

    private void dfs(int index, int n, int left, int right, StringBuilder path, List<String> res) {
        if (index == n) {
            if (left == right) {
                res.add(new String(path));
            }
            return;
        }
        if (right > left) {
            return;
        }
        path.append('(');
        dfs(index+1, n, left+1, right, path, res);
        path.deleteCharAt(path.length()-1);

        path.append(')');
        dfs(index+1, n, left, right+1, path, res);
        path.deleteCharAt(path.length()-1);
    }

    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        List<String> res = generateParenthesis.generateParenthesis(3);
        System.out.println(res);
    }
}
