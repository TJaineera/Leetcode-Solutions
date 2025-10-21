/**
 * Title: reverse-integer
 * Slug: reverse-integer
 * URL: https://leetcode.com/problems/reverse-integer/
 * Language: java
 * Submitted: 2025-10-21T16:00:52.062Z
 */

class Solution {
    public int reverse(int x) {
        long rev = 0;
        
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) rev;
    }
}
