/**
 * Title: restore-finishing-order
 * Slug: restore-finishing-order
 * URL: https://leetcode.com/problems/restore-finishing-order/submissions/1834678195/
 * Language: java
 * Submitted: 2025-11-19T23:06:40.544Z
 */

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = order.length;

        // Map: pos[id] = finishing index in order[]
        int[] pos = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pos[order[i]] = i;
        }

        // Sort friends by finishing position
        Integer[] arr = new Integer[friends.length];
        for (int i = 0; i < friends.length; i++) {
            arr[i] = friends[i];
        }

        Arrays.sort(arr, (a, b) -> pos[a] - pos[b]);

        // Convert back to int[]
        int[] result = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}
