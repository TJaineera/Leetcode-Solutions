/**
 * Title: reverse-string
 * Slug: reverse-string
 * URL: https://leetcode.com/problems/reverse-string/
 * Language: java
 * Submitted: 2025-10-24T16:57:07.155Z
 */

class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
    }
}
