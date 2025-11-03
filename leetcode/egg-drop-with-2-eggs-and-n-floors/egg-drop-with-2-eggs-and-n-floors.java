/**
 * Title: egg-drop-with-2-eggs-and-n-floors
 * Slug: egg-drop-with-2-eggs-and-n-floors
 * URL: https://leetcode.com/problems/egg-drop-with-2-eggs-and-n-floors/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-11-03T19:45:12.619Z
 */

class Solution {
    public int twoEggDrop(int n) {
        int x = 1;
        while (x * (x + 1) / 2 < n) {
            x++;
        }
        return x;
    }
}
