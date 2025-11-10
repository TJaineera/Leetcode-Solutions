/**
 * Title: maximum-number-of-coins-you-can-get
 * Slug: maximum-number-of-coins-you-can-get
 * URL: https://leetcode.com/problems/maximum-number-of-coins-you-can-get/submissions/1826192910/?envType=problem-list-v2&envId=sorting
 * Language: java
 * Submitted: 2025-11-10T17:18:29.834Z
 */

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length, ans = 0;
        for (int i = n / 3; i < n; i += 2) {
            ans += piles[i];
        }
        return ans;
    }
}
