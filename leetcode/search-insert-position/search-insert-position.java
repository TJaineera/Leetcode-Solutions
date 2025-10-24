/**
 * Title: search-insert-position
 * Slug: search-insert-position
 * URL: https://leetcode.com/problems/search-insert-position/
 * Language: java
 * Submitted: 2025-10-24T16:52:54.799Z
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // prevent overflow
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // If not found, left is the insertion position
        return left;
    }
}
