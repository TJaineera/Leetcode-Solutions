/**
 * Title: fibonacci-number
 * Slug: fibonacci-number
 * URL: https://leetcode.com/problems/fibonacci-number/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-10-22T17:51:26.930Z
 */

class Solution {
    public int fib(int n) {
        if (n < 2) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
