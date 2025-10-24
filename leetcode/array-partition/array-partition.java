/**
 * Title: array-partition
 * Slug: array-partition
 * URL: https://leetcode.com/problems/array-partition/?envType=problem-list-v2&envId=counting-sort
 * Language: java
 * Submitted: 2025-10-24T15:48:39.010Z
 */

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
