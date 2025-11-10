/**
 * Title: transform-array-by-parity
 * Slug: transform-array-by-parity
 * URL: https://leetcode.com/problems/transform-array-by-parity/?envType=problem-list-v2&envId=sorting
 * Language: java
 * Submitted: 2025-11-10T16:49:19.675Z
 */

class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int evenCount = 0;
        for (int x : nums) {
            if (x % 2 == 0) evenCount++;
        }
        int[] result = new int[n];
        // fill first evenCount with 0
        for (int i = 0; i < evenCount; i++) {
            result[i] = 0;
        }
        // fill the rest with 1
        for (int i = evenCount; i < n; i++) {
            result[i] = 1;
        }
        return result;
    }
}
