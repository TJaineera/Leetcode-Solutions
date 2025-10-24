/**
 * Title: minimum-operations-to-make-binary-array-elements-equal-to-one-i
 * Slug: minimum-operations-to-make-binary-array-elements-equal-to-one-i
 * URL: https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/?envType=problem-list-v2&envId=queue
 * Language: java
 * Submitted: 2025-10-24T19:33:57.339Z
 */

public class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int operations = 0;

        for (int i = 0; i + 2 < n; i++) {
            if (nums[i] == 0) {
                // Flip the next three elements
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                operations++;
            }
        }

        // Check if the last two elements are 0
        if (nums[n - 1] == 0 || nums[n - 2] == 0) {
            return -1;
        }

        return operations;
    }
}
