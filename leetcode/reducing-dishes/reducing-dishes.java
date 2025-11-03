/**
 * Title: For those who are wondering why -1 is taken in Example 1.
 * Slug: reducing-dishes
 * URL: https://leetcode.com/problems/reducing-dishes/submissions/1819929635/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-11-03T19:49:38.389Z
 */

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int total = 0, res = 0;
        for (int i = satisfaction.length - 1; i >= 0; i--) {
            total += satisfaction[i];
            if (total < 0) break;
            res += total;
        }
        return res;
    }
}