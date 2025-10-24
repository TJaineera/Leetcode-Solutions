/**
 * Title: top-k-frequent-elements
 * Slug: top-k-frequent-elements
 * URL: https://leetcode.com/problems/top-k-frequent-elements/?envType=problem-list-v2&envId=bucket-sort
 * Language: java
 * Submitted: 2025-10-24T15:43:32.731Z
 */

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());  // sort by frequency

        int[] res = new int[k];
        for (int i = 0; i < k; i++)
            res[i] = list.get(i).getKey();
        return res;
    }
}