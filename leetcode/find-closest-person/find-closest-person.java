/**
 * Title: find-closest-person
 * Slug: find-closest-person
 * URL: https://leetcode.com/problems/find-closest-person/?envType=problem-list-v2&envId=math
 * Language: java
 * Submitted: 2025-10-28T21:07:57.368Z
 */

class Solution {
    public int findClosest(int x, int y, int z) {
        int dist1 = Math.abs(x - z);
        int dist2 = Math.abs(y - z);

        if (dist1 < dist2) {
            return 1;
        } else if (dist2 < dist1) {
            return 2;
        } else {
            return 0;
        }
    }
}
