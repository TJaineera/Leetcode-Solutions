/**
 * Title: sort-characters-by-frequency
 * Slug: sort-characters-by-frequency
 * URL: https://leetcode.com/problems/sort-characters-by-frequency/?envType=problem-list-v2&envId=bucket-sort
 * Language: java
 * Submitted: 2025-10-24T15:45:11.735Z
 */

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> e : list)
            for (int i = 0; i < e.getValue(); i++)
                sb.append(e.getKey());

        return sb.toString();
    }
}
