/**
 * Title: contains-duplicate-iii
 * Slug: contains-duplicate-iii
 * URL: https://leetcode.com/problems/contains-duplicate-iii/?envType=problem-list-v2&envId=bucket-sort
 * Language: java
 * Submitted: 2025-10-24T15:42:39.977Z
 */


class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (valueDiff < 0 || indexDiff <= 0) return false;

        long w = (long) valueDiff + 1; // bucket width
        Map<Long, Long> buckets = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            long x = nums[i];
            long bucketId = getBucketId(x, w);

            // 1. same bucket
            if (buckets.containsKey(bucketId)) {
                return true;
            }

            // 2. neighbor buckets
            if (buckets.containsKey(bucketId - 1) &&
                Math.abs(x - buckets.get(bucketId - 1)) <= valueDiff) {
                return true;
            }
            if (buckets.containsKey(bucketId + 1) &&
                Math.abs(x - buckets.get(bucketId + 1)) <= valueDiff) {
                return true;
            }

            // put current
            buckets.put(bucketId, x);

            // maintain sliding window of size indexDiff
            if (i >= indexDiff) {
                long old = nums[i - indexDiff];
                long oldBucketId = getBucketId(old, w);
                buckets.remove(oldBucketId);
            }
        }

        return false;
    }

    private long getBucketId(long x, long w) {
        // floor division that works for negatives
        if (x >= 0) return x / w;
        return ((x + 1) / w) - 1;
    }
}
