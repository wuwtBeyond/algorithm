package com.github.algorithm;

import java.util.Stack;

/**
 * @author : wuwentao
 * @date : 2020/5/5
 */
public class StockSpanner {

    /**
     * int[0] 代表价格
     * int[1] 代表小于等于该价格的天数（包括自己）
     */
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int count = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            int[] ele = stack.pop();
            count += ele[1];
        }

        stack.push(new int[]{price, count});

        return count;
    }
}
