/**
 * Title: number-of-ways-to-stay-in-the-same-place-after-some-steps
 * Slug: number-of-ways-to-stay-in-the-same-place-after-some-steps
 * URL: https://leetcode.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-10-28T17:07:04.163Z
 */

class Solution {
    public int numWays(int steps, int arrLen) {
        int MOD = 1_000_000_007;

        // We never need to consider positions beyond steps/2
        int maxPos = Math.min(arrLen - 1, steps / 2 + 1);

        long[] dp = new long[maxPos + 1];
        dp[0] = 1;

        for (int s = 1; s <= steps; s++) {
            long[] next = new long[maxPos + 1];

            for (int pos = 0; pos <= maxPos; pos++) {
                // stay
                next[pos] = (next[pos] + dp[pos]) % MOD;

                // move from left (pos-1 -> pos)
                if (pos - 1 >= 0) {
                    next[pos] = (next[pos] + dp[pos - 1]) % MOD;
                }

                // move from right (pos+1 -> pos)
                if (pos + 1 <= maxPos) {
                    next[pos] = (next[pos] + dp[pos + 1]) % MOD;
                }
            }

            dp = next;
        }

        return (int) dp[0];
    }
}
