/**
 * Title: height-checker
 * Slug: height-checker
 * URL: https://leetcode.com/problems/height-checker/?envType=problem-list-v2&envId=counting-sort
 * Language: java
 * Submitted: 2025-10-24T15:49:38.004Z
 */

class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) count++;
        }
        return count;
    }
}
