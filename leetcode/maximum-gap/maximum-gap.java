/**
 * Title: maximum-gap
 * Slug: maximum-gap
 * URL: https://leetcode.com/problems/maximum-gap/?envType=problem-list-v2&envId=bucket-sort
 * Language: java
 * Submitted: 2025-10-24T15:40:36.631Z
 */

class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        if (min == max) return 0;

        int bucketSize = Math.max(1, (max - min) / (n - 1));
        int bucketCount = (max - min) / bucketSize + 1;
        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        boolean[] used = new boolean[bucketCount];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);

        for (int num : nums) {
            int idx = (num - min) / bucketSize;
            bucketMin[idx] = Math.min(bucketMin[idx], num);
            bucketMax[idx] = Math.max(bucketMax[idx], num);
            used[idx] = true;
        }

        int prev = min, res = 0;
        for (int i = 0; i < bucketCount; i++) {
            if (!used[i]) continue;
            res = Math.max(res, bucketMin[i] - prev);
            prev = bucketMax[i];
        }
        return res;
    }
}
