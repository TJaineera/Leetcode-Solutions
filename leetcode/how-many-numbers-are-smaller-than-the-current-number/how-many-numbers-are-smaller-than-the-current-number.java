/**
 * Title: how-many-numbers-are-smaller-than-the-current-number
 * Slug: how-many-numbers-are-smaller-than-the-current-number
 * URL: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/?envType=problem-list-v2&envId=counting-sort
 * Language: java
 * Submitted: 2025-10-24T15:51:07.056Z
 */

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < sorted.length; i++)
            indexMap.putIfAbsent(sorted[i], i);

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            res[i] = indexMap.get(nums[i]);

        return res;
    }
}
