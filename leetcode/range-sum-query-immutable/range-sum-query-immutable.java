/**
 * Title: range-sum-query-immutable
 * Slug: range-sum-query-immutable
 * URL: https://leetcode.com/problems/range-sum-query-immutable/?envType=problem-list-v2&envId=design
 * Language: java
 * Submitted: 2025-10-24T16:44:47.971Z
 */

class NumArray {
    private int[] prefix;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefix = new int[n + 1]; // prefix[0] = 0
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
