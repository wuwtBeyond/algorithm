package com.github.algorithm.greedy;

public class MaxDepthAfterSplit {

    public int[] maxDepthAfterSplit(String seq) {
        int[] ans = new int [seq.length()];
        int idx = 0;
        for(char c: seq.toCharArray()) {
            ans[idx++] = c == '(' ? idx & 1 : ((idx + 1) & 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        MaxDepthAfterSplit maxDepthAfterSplit = new MaxDepthAfterSplit();
        maxDepthAfterSplit.maxDepthAfterSplit("()(())()");
    }
}
