package com.leetcode;

/**
 * @author himanshu
 * Best time to buy or sell stock problems
 */
public class MaxProfitSet {

    public static int maxProfit1(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i]-min);
        }
        return profit;
    }
    
    public static int maxProfit2(int[] prices) {
        int l = 0, max = 0;
        while (l + 1 < prices.length && prices[l] >= prices[l+1]) l++;
        if (l >= prices.length - 1) return max;
        int r = l+1;
        while (l < prices.length && r < prices.length) {
            while (r+1 < prices.length && prices[r+1] > prices[r]) r++;
            max += prices[r] - prices[l];
            l = r+1;
            r++;
        }
        return max;
    }
    
    public static int maxProfitWithCooldown(int[] prices) {
        int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
        for (int price : prices) {
            prev_buy = buy;
            buy = Math.max(prev_sell - price, prev_buy);
            prev_sell = sell;
            sell = Math.max(prev_buy + price, prev_sell);
        }
        return sell;
    }
    
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 0, 2};
		System.out.println(maxProfit1(arr));
		System.out.println(maxProfit2(arr));
		System.out.println(maxProfitWithCooldown(arr));
	}

}
