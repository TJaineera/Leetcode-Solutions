/**
 * Title: counting-bits
 * Slug: counting-bits
 * URL: https://leetcode.com/problems/counting-bits/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-10-22T17:49:42.791Z
 */

class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}
