/**
 * Title: zigzag-conversion
 * Slug: zigzag-conversion
 * URL: https://leetcode.com/problems/zigzag-conversion/description/
 * Language: java
 * Submitted: 2025-10-21T16:00:08.966Z
 */

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) rows[i] = new StringBuilder();

        int cur = 0;
        boolean down = false;
        for (char c : s.toCharArray()) {
            rows[cur].append(c);
            if (cur == 0 || cur == numRows - 1) down = !down;
            cur += down ? 1 : -1;
        }

        StringBuilder ans = new StringBuilder();
        for (StringBuilder row : rows) ans.append(row);
        return ans.toString();
    }
}
