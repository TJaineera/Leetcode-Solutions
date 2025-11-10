/**
 * Title: widest-vertical-area-between-two-points-containing-no-points
 * Slug: widest-vertical-area-between-two-points-containing-no-points
 * URL: https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/?envType=problem-list-v2&envId=sorting
 * Language: java
 * Submitted: 2025-11-10T17:03:56.881Z
 */

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) xs[i] = points[i][0];

        Arrays.sort(xs);

        int ans = 0;
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, xs[i] - xs[i - 1]);
        }
        return ans;
    }
}
