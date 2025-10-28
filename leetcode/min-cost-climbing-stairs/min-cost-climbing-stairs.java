/**
 * Title: min-cost-climbing-stairs
 * Slug: min-cost-climbing-stairs
 * URL: https://leetcode.com/problems/min-cost-climbing-stairs/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-10-28T16:56:49.093Z
 */

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        // dp[i] = min cost to reach step i (i can be n, the "top")

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            int oneStep = dp[i - 1] + cost[i - 1];
            int twoStep = dp[i - 2] + cost[i - 2];
            dp[i] = Math.min(oneStep, twoStep);
        }

        return dp[n];
    }
}
