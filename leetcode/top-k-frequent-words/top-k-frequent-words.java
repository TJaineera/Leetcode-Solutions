/**
 * Title: Top K Frequent Words
 * Slug: top-k-frequent-words
 * URL: https://leetcode.com/problems/top-k-frequent-words/?envType=problem-list-v2&envId=bucket-sort
 * Language: java
 * Submitted: 2025-10-24T15:46:01.991Z
 */

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words)
            freq.put(w, freq.getOrDefault(w, 0) + 1);

        List<String> list = new ArrayList<>(freq.keySet());
        list.sort((a, b) -> {
            int fa = freq.get(a), fb = freq.get(b);
            if (fa == fb) return a.compareTo(b); // lexicographical
            return fb - fa; // higher frequency first
        });

        return list.subList(0, k);
    }
}
