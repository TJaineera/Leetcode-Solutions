/**
 * Title: intersection-of-two-arrays
 * Slug: intersection-of-two-arrays
 * URL: https://leetcode.com/problems/intersection-of-two-arrays/
 * Language: java
 * Submitted: 2025-10-24T16:58:17.713Z
 */


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert result set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}
