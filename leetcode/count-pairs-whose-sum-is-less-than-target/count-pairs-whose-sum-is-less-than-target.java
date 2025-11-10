/**
 * Title: count-pairs-whose-sum-is-less-than-target
 * Slug: count-pairs-whose-sum-is-less-than-target
 * URL: https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/submissions/1826174729/?envType=problem-list-v2&envId=sorting
 * Language: java
 * Submitted: 2025-11-10T16:59:39.062Z
 */

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) count++;
            }
        }
        return count;
    }
}
