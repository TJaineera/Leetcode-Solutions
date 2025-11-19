/**
 * Title: number-of-good-pairs
 * Slug: number-of-good-pairs
 * URL: https://leetcode.com/problems/number-of-good-pairs/submissions/1834679458/
 * Language: java
 * Submitted: 2025-11-19T23:10:11.999Z
 */

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101]; // nums[i] is in [1,100]
        for (int x : nums) {
            freq[x]++;
        }

        int res = 0;
        for (int f : freq) {
            if (f > 1) {
                res += f * (f - 1) / 2;
            }
        }
        return res;
    }
}
