/**
 * Title: count-subarrays-with-fixed-bounds
 * Slug: count-subarrays-with-fixed-bounds
 * URL: https://leetcode.com/problems/count-subarrays-with-fixed-bounds/submissions/1810661512/?envType=problem-list-v2&envId=queue
 * Language: java
 * Submitted: 2025-10-24T19:37:32.756Z
 */

public class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int lastMin = -1, lastMax = -1, leftBound = -1;

        for (int i = 0; i < nums.length; i++) {
            // Update left boundary if out-of-bound element
            if (nums[i] < minK || nums[i] > maxK) {
                leftBound = i;
            }

            // Update last seen minK and maxK
            if (nums[i] == minK) lastMin = i;
            if (nums[i] == maxK) lastMax = i;

            // Add valid subarrays ending at i
            int validStart = Math.min(lastMin, lastMax);
            if (validStart > leftBound) {
                count += validStart - leftBound;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 3, 5, 2, 7, 5};
        int minK = 1, maxK = 5;
        System.out.println(sol.countSubarrays(nums, minK, maxK)); // Output: 2
    }
}
