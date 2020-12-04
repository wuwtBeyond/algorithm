package com.github.algorithm.greedy;

public class MaxProfit {

    /**
     * 多次买卖，有冷冻期
     * @param prices
     * @return
     */
    public int maxProfit4(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        int f0 = -prices[0];
        int f1 = 0;
        int f2 = 0;
        for (int i = 1; i < n; ++i) {
            int newf0 = Math.max(f0, f2 - prices[i]);
            int newf1 = f0 + prices[i];
            int newf2 = Math.max(f1, f2);
            f0 = newf0;
            f1 = newf1;
            f2 = newf2;
        }

        return Math.max(f1, f2);
    }


    /**
     * 多次买卖，有手续费
     * @param prices
     * @param fee
     * @return
     */
    public int maxProfit3(int[] prices, int fee) {
        if (prices.length <= 0) {
            return 0;
        }

        int sell = 0, hold = -prices[0];
        for (int i = 1;i < prices.length;i ++) {
            sell = Math.max(sell, hold+prices[i]-fee);
            hold = Math.max(hold, sell-prices[i]);
        }

        return sell;
    }

    /**
     * 允许多次买卖
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }

        int hold  = -prices[0], sell = 0;
        for (int i = 1;i < prices.length;i ++) {
            sell = Math.max(sell, hold+prices[i]);
            hold = Math.max(hold, sell-prices[i]);
        }

        return sell;
    }

    /**
     * 最多一次买卖
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }

        int min = prices[0], profit = 0;

        for (int i = 1;i < prices.length; i ++) {
            profit = Math.max(profit, prices[i]-min);
            min = Math.min(min, prices[i]);
        }

        return profit;
    }


    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
//        maxProfit.maxProfit1(new int[]{7,1,5,3,6,4});
//        maxProfit.maxProfit3(new int[]{1,3,2,8,4,9}, 2);
        maxProfit.maxProfit4(new int[]{1,2,3,0,2});

    }
}
