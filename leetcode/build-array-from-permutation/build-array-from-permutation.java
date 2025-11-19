/**
 * Title: build-array-from-permutation
 * Slug: build-array-from-permutation
 * URL: https://leetcode.com/problems/build-array-from-permutation/submissions/1834678807/
 * Language: java
 * Submitted: 2025-11-19T23:08:24.869Z
 */

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        
        return ans;
    }
}
