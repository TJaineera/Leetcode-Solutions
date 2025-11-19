/**
 * Title: score-of-a-string
 * Slug: score-of-a-string
 * URL: https://leetcode.com/problems/score-of-a-string/
 * Language: java
 * Submitted: 2025-11-19T23:00:24.073Z
 */

class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }
}
