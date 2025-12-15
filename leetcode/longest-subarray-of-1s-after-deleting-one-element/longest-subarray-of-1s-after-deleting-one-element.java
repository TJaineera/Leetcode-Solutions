/**
 * Title: longest-subarray-of-1s-after-deleting-one-element
 * Slug: longest-subarray-of-1s-after-deleting-one-element
 * URL: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/submissions/1856601706/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-12-15T20:14:26.334Z
 */

class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, zeros = 0, best = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;

            while (zeros > 1) {
                if (nums[left] == 0) zeros--;
                left++;
            }

            // window has <= 1 zero; delete one element => length - 1
            best = Math.max(best, right - left);
        }

        return best;
    }
}
