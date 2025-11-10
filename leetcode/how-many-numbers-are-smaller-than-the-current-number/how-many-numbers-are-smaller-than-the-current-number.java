/**
 * Title: how-many-numbers-are-smaller-than-the-current-number
 * Slug: how-many-numbers-are-smaller-than-the-current-number
 * URL: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/1826175918/?envType=problem-list-v2&envId=sorting
 * Language: java
 * Submitted: 2025-11-10T17:00:56.052Z
 */

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) count++;
            }
            result[i] = count;
        }
        return result;
    }
}
