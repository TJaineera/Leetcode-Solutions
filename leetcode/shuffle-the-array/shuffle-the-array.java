/**
 * Title: shuffle-the-array
 * Slug: shuffle-the-array
 * URL: https://leetcode.com/problems/shuffle-the-array/submissions/1834680625/
 * Language: java
 * Submitted: 2025-11-19T23:13:34.328Z
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            res[idx++] = nums[i];      // x_i
            res[idx++] = nums[i + n];  // y_i
        }

        return res;
    }
}
