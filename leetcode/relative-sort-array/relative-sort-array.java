/**
 * Title: relative-sort-array
 * Slug: relative-sort-array
 * URL: https://leetcode.com/problems/relative-sort-array/submissions/1810475727/?envType=problem-list-v2&envId=counting-sort
 * Language: java
 * Submitted: 2025-10-24T15:50:34.337Z
 */

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> order = new HashMap<>();
        for (int i = 0; i < arr2.length; i++)
            order.put(arr2[i], i);

        Integer[] temp = Arrays.stream(arr1).boxed().toArray(Integer[]::new);

        Arrays.sort(temp, (a, b) -> {
            int rankA = order.getOrDefault(a, arr2.length);
            int rankB = order.getOrDefault(b, arr2.length);
            if (rankA == rankB) return a - b;
            return rankA - rankB;
        });

        return Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
    }
}
