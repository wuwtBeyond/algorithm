package com.github.algorithm.array;

/**
 * @author : wuwentao
 * @date : 2020/5/27
 */
public class BestTimetoBuyandSellStockII {

    /**
     * 找到局部最小值和局部最大值，然后作差求盈利
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int i = 0, buy, sell, profit = 0, N = prices.length - 1;
        while (i < N) {
            while (i < N && prices[i + 1] <= prices[i]) i++;
            buy = prices[i];

            while (i < N && prices[i + 1] > prices[i]) i++;
            sell = prices[i];

            profit += sell - buy;
        }
        return profit;
    }
}
