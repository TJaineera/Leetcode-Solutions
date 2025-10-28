/**
 * Title: partition-array-for-maximum-sum
 * Slug: partition-array-for-maximum-sum
 * URL: https://leetcode.com/problems/partition-array-for-maximum-sum/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-10-28T17:03:28.398Z
 */

class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];  // dp[i] = max sum for first i elements

        for (int i = 1; i <= n; i++) {
            int maxVal = 0;
            int best = 0;
            // Try all partition sizes ending at i-1
            for (int len = 1; len <= k && i - len >= 0; len++) {
                maxVal = Math.max(maxVal, arr[i - len]);
                best = Math.max(best, dp[i - len] + maxVal * len);
            }
            dp[i] = best;
        }

        return dp[n];
    }
}
