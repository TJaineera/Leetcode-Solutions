/**
 * Title: Four Ways to get Accepted
 * Slug: palindromic-substrings
 * URL: https://leetcode.com/problems/palindromic-substrings/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-10-28T17:02:10.468Z
 */

class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }
}
