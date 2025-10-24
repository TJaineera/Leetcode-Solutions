/**
 * Title: Code
 * Slug: minimum-number-of-moves-to-seat-everyone
 * URL: https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/?envType=problem-list-v2&envId=counting-sort
 * Language: java
 * Submitted: 2025-10-24T15:53:28.317Z
 */

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        for (int i = 0; i < seats.length; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }
        return moves;
    }
}
