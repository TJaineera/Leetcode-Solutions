/**
 * Title: single-number
 * Slug: single-number
 * URL: https://leetcode.com/problems/single-number/
 * Language: java
 * Submitted: 2025-10-24T16:51:57.962Z
 */

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR accumulates the single number
        }
        return result;
    }
}
