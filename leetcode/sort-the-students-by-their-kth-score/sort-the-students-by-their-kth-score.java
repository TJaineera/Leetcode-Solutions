/**
 * Title: sort-the-students-by-their-kth-score
 * Slug: sort-the-students-by-their-kth-score
 * URL: https://leetcode.com/problems/sort-the-students-by-their-kth-score/submissions/1826181171/?envType=problem-list-v2&envId=sorting
 * Language: java
 * Submitted: 2025-11-10T17:06:27.724Z
 */

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a, b) -> b[k] - a[k]);
        return score;
    }
}