/**
 * Title: n-th-tribonacci-number
 * Slug: n-th-tribonacci-number
 * URL: https://leetcode.com/problems/n-th-tribonacci-number/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-10-28T17:04:19.939Z
 */

class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int t0 = 0;
        int t1 = 1;
        int t2 = 1;

        for (int i = 3; i <= n; i++) {
            int t3 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }

        return t2;
    }
}
