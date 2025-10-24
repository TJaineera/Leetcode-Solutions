/**
 * Title: design-neighbor-sum-service
 * Slug: design-neighbor-sum-service
 * URL: https://leetcode.com/problems/design-neighbor-sum-service/?envType=problem-list-v2&envId=design
 * Language: java
 * Submitted: 2025-10-24T16:49:49.288Z
 */

import java.util.HashMap;
import java.util.Map;

class NeighborSumService {
    private int[][] grid;
    private Map<Integer, int[]> positions;
    private int n;

    public NeighborSumService(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.positions = new HashMap<>();
        preprocess();
    }

    private void preprocess() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                positions.put(grid[i][j], new int[]{i, j});
            }
        }
    }

    public int adjacentSum(int value) {
        int[] pos = positions.get(value);
        int sum = 0;

        // Check up, down, left, right
        if (pos[0] > 0) sum += grid[pos[0] - 1][pos[1]]; // up
        if (pos[0] < n - 1) sum += grid[pos[0] + 1][pos[1]]; // down
        if (pos[1] > 0) sum += grid[pos[0]][pos[1] - 1]; // left
        if (pos[1] < n - 1) sum += grid[pos[0]][pos[1] + 1]; // right

        return sum;
    }

    public int diagonalSum(int value) {
        int[] pos = positions.get(value);
        int sum = 0;

        // Check top-left, top-right, bottom-left, bottom-right
        if (pos[0] > 0 && pos[1] > 0) sum += grid[pos[0] - 1][pos[1] - 1]; // top-left
        if (pos[0] > 0 && pos[1] < n - 1) sum += grid[pos[0] - 1][pos[1] + 1]; // top-right
        if (pos[0] < n - 1 && pos[1] > 0) sum += grid[pos[0] + 1][pos[1] - 1]; // bottom-left
        if (pos[0] < n - 1 && pos[1] < n - 1) sum += grid[pos[0] + 1][pos[1] + 1]; // bottom-right

        return sum;
    }
}
