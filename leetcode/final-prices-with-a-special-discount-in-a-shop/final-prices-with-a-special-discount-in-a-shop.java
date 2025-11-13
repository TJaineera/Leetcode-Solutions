/**
 * Title: final-prices-with-a-special-discount-in-a-shop
 * Slug: final-prices-with-a-special-discount-in-a-shop
 * URL: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/?envType=problem-list-v2&envId=stack
 * Language: java
 * Submitted: 2025-11-13T22:18:43.744Z
 */

class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> stack = new Stack<>(); 

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int idx = stack.pop();
                prices[idx] -= prices[i];   
            }
            stack.push(i);
        }
        return prices;
    }
}
