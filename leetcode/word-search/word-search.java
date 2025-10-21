/**
 * Title: word-search
 * Slug: word-search
 * URL: https://leetcode.com/problems/word-search/
 * Language: java
 * Submitted: 2025-10-21T18:52:01.787Z
 */

class Solution {
    public boolean exist(char[][] board, String word) {
        int R = board.length, C = board[0].length;

        // optional micro-pruning: reverse if last char rarer than first
        int cntFirst = 0, cntLast = 0;
        char a = word.charAt(0), b = word.charAt(word.length()-1);
        for (char[] row : board)
            for (char ch : row) {
                if (ch == a) cntFirst++;
                if (ch == b) cntLast++;
            }
        if (cntLast < cntFirst) word = new StringBuilder(word).reverse().toString();

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (board[r][c] == word.charAt(0) && dfs(board, r, c, 0, word))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] b, int r, int c, int k, String w) {
        if (k == w.length()) return true;
        if (r < 0 || r >= b.length || c < 0 || c >= b[0].length || b[r][c] != w.charAt(k))
            return false;

        char ch = b[r][c];
        b[r][c] = '#'; // mark visited

        boolean found = dfs(b, r+1, c, k+1, w) ||
                        dfs(b, r-1, c, k+1, w) ||
                        dfs(b, r, c+1, k+1, w) ||
                        dfs(b, r, c-1, k+1, w);

        b[r][c] = ch; // unmark
        return found;
    }
}
