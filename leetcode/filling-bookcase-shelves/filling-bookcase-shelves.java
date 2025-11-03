/**
 * Title: filling-bookcase-shelves
 * Slug: filling-bookcase-shelves
 * URL: https://leetcode.com/problems/filling-bookcase-shelves/submissions/1819931864/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-11-03T19:53:03.765Z
 */

class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int width = 0, maxH = 0;
            dp[i] = Integer.MAX_VALUE;

            // Put books j..i-1 on the last shelf
            for (int j = i; j >= 1; j--) {
                width += books[j - 1][0];                 // thickness
                if (width > shelfWidth) break;
                maxH = Math.max(maxH, books[j - 1][1]);   // height
                dp[i] = Math.min(dp[i], dp[j - 1] + maxH);
            }
        }
        return dp[n];
    }
}
