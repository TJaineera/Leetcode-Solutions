/**
 * Title: stone-game-ii
 * Slug: stone-game-ii
 * URL: https://leetcode.com/problems/stone-game-ii/submissions/1819930460/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-11-03T19:50:53.838Z
 */

class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[] suffix = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) suffix[i] = suffix[i + 1] + piles[i];

        Integer[][] memo = new Integer[n][n + 1]; // i in [0..n-1], M in [1..n]

        return dfs(0, 1, piles, suffix, memo);
    }

    private int dfs(int i, int M, int[] piles, int[] suffix, Integer[][] memo) {
        int n = piles.length;
        if (i >= n) return 0;
        if (i + 2 * M >= n) return suffix[i]; // can take all left
        if (memo[i][M] != null) return memo[i][M];

        int best = 0;
        // try taking x piles where 1 <= x <= 2M
        for (int x = 1; x <= 2 * M; x++) {
            int opp = dfs(i + x, Math.max(M, x), piles, suffix, memo);
            best = Math.max(best, suffix[i] - opp);
        }
        return memo[i][M] = best;
    }
}
