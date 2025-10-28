/**
 * Title: painting-a-grid-with-three-different-colors
 * Slug: painting-a-grid-with-three-different-colors
 * URL: https://leetcode.com/problems/painting-a-grid-with-three-different-colors/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-10-28T17:00:43.790Z
 */

import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;

    public int colorTheGrid(int m, int n) {
        List<Integer> patterns = new ArrayList<>();
        buildPatterns(0, m, 0, patterns);           // generate valid column colorings
        int size = patterns.size();

        // Precompute adjacency between patterns
        boolean[][] compatible = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isCompatible(patterns.get(i), patterns.get(j), m)) {
                    compatible[i][j] = true;
                }
            }
        }

        long[] dp = new long[size];
        Arrays.fill(dp, 1);                         // first column
        for (int col = 1; col < n; col++) {
            long[] next = new long[size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (compatible[i][j]) {
                        next[j] = (next[j] + dp[i]) % MOD;
                    }
                }
            }
            dp = next;
        }

        long ans = 0;
        for (long v : dp) ans = (ans + v) % MOD;
        return (int) ans;
    }

    // Recursively build all valid column color patterns (base-3 encoding)
    private void buildPatterns(int pos, int m, int code, List<Integer> list) {
        if (pos == m) {
            list.add(code);
            return;
        }
        for (int color = 0; color < 3; color++) {
            if (pos > 0 && ((code >> ((pos - 1) * 2)) & 3) == color) continue;
            buildPatterns(pos + 1, m, code | (color << (pos * 2)), list);
        }
    }

    // Adjacent columns are compatible if every corresponding row has different colors
    private boolean isCompatible(int a, int b, int m) {
        for (int i = 0; i < m; i++) {
            int ca = (a >> (i * 2)) & 3;
            int cb = (b >> (i * 2)) & 3;
            if (ca == cb) return false;
        }
        return true;
    }
}
