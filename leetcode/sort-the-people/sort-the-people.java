/**
 * Title: Approach 6: Heap Sort
 * Slug: sort-the-people
 * URL: https://leetcode.com/problems/sort-the-people/submissions/1826185806/?envType=problem-list-v2&envId=sorting
 * Language: java
 * Submitted: 2025-11-10T17:11:08.307Z
 */

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;

        Arrays.sort(indices, (a, b) -> heights[b] - heights[a]);

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = names[indices[i]];
        }
        return result;
    }
}