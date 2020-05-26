package com.github.algorithm.array;

/**
 * @author : wuwentao
 * @date : 2020/5/26
 */
public class BestTimetoBuyandSellStock {

    /**
     * 转化为最大子数组和问题
     * 不同的是，不可能存在值为负数的情况，所以最后返回时作个判断
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int maxCur = prices[1]-prices[0], maxRes = prices[1]-prices[0];
        for (int i = 2;i < prices.length;i ++) {
            maxCur = Math.max(prices[i]-prices[i-1], maxCur+prices[i]-prices[i-1]);
            maxRes = Math.max(maxRes, maxCur);
        }

        return maxRes > 0 ? maxRes : 0;
    }

}
