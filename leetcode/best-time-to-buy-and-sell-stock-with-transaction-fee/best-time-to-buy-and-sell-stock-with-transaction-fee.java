/**
 * Title: One transaction = both buying and selling
 * Slug: best-time-to-buy-and-sell-stock-with-transaction-fee
 * URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-11-03T19:51:30.437Z
 */

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            int prevCash = cash;

            // Option to sell today
            cash = Math.max(cash, hold + price - fee);
            // Option to buy today (use prevCash to avoid overwriting)
            hold = Math.max(hold, prevCash - price);
        }
        return cash;
    }
}
