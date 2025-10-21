/**
 * Title: 3sum-closest
 * Slug: 3sum-closest
 * URL: https://leetcode.com/problems/3sum-closest/
 * Language: java
 * Submitted: 2025-10-21T16:01:09.333Z
 */

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with the first three elements

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1; // Two pointers

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // If exact match found, return immediately
                if (sum == target) {
                    return sum;
                }

                // Update closest sum if this sum is closer to target
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                // Move pointers
                if (sum < target) {
                    left++; // Increase sum
                } else {
                    right--; // Decrease sum
                }
            }
        }
        
        return closestSum;
    }
}
