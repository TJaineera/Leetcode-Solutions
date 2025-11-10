/**
 * Title: sort-matrix-by-diagonals
 * Slug: sort-matrix-by-diagonals
 * URL: https://leetcode.com/problems/sort-matrix-by-diagonals/submissions/1826189771/?envType=problem-list-v2&envId=sorting
 * Language: java
 * Submitted: 2025-11-10T17:15:19.895Z
 */

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> diag = new HashMap<>();

        // 1) collect by diagonal key (i - j)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                diag.computeIfAbsent(key, k -> new ArrayList<>()).add(grid[i][j]);
            }
        }

        // 2) sort each diagonal: key >= 0 -> descending; key < 0 -> ascending
        for (Map.Entry<Integer, List<Integer>> e : diag.entrySet()) {
            List<Integer> lst = e.getValue();
            if (e.getKey() >= 0) {
                lst.sort(Comparator.reverseOrder()); // bottom-left (incl. main): non-increasing
            } else {
                lst.sort(Comparator.naturalOrder()); // top-right: non-decreasing
            }
        }

        // 3) write back in TL->BR order along each diagonal
        Map<Integer, Integer> idx = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                int k = idx.getOrDefault(key, 0);
                grid[i][j] = diag.get(key).get(k);
                idx.put(key, k + 1);
            }
        }
        return grid;
    }
}
