/**
 * Title: minimum-average-of-smallest-and-largest-elements
 * Slug: minimum-average-of-smallest-and-largest-elements
 * URL: https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/submissions/1826183019/?envType=problem-list-v2&envId=sorting
 * Language: java
 * Submitted: 2025-11-10T17:08:18.023Z
 */

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double minAvg = Double.MAX_VALUE;
        for (int i = 0; i < n / 2; i++) {
            double avg = (nums[i] + nums[n - 1 - i]) / 2.0;
            if (avg < minAvg) {
                minAvg = avg;
            }
        }
        return minAvg;
    }
}
