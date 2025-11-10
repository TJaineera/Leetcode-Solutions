/**
 * Title: minimum-sum-of-four-digit-number-after-splitting-digits
 * Slug: minimum-sum-of-four-digit-number-after-splitting-digits
 * URL: https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/?envType=problem-list-v2&envId=sorting
 * Language: java
 * Submitted: 2025-11-10T17:05:15.338Z
 */

class Solution {
    public int minimumSum(int num) {
        int[] d = new int[4];
        for (int i = 0; i < 4; i++) {
            d[i] = num % 10;
            num /= 10;
        }
        java.util.Arrays.sort(d);
        return (10 * d[0] + d[2]) + (10 * d[1] + d[3]);
    }
}
