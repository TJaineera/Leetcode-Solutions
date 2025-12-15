/**
 * Title: maximum-repeating-substring
 * Slug: maximum-repeating-substring
 * URL: https://leetcode.com/problems/maximum-repeating-substring/submissions/1856600518/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-12-15T20:11:59.429Z
 */

class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(word);
            if (sequence.contains(sb.toString())) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }
}
