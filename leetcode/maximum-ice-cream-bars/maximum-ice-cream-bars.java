/**
 * Title: maximum-ice-cream-bars
 * Slug: maximum-ice-cream-bars
 * URL: https://leetcode.com/problems/maximum-ice-cream-bars/?envType=problem-list-v2&envId=counting-sort
 * Language: java
 * Submitted: 2025-10-24T15:54:52.091Z
 */

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int cost : costs) {
            if (coins >= cost) {
                coins -= cost;
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
