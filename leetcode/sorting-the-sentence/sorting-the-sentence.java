/**
 * Title: sorting-the-sentence
 * Slug: sorting-the-sentence
 * URL: https://leetcode.com/problems/sorting-the-sentence/submissions/1826191663/?envType=problem-list-v2&envId=sorting
 * Language: java
 * Submitted: 2025-11-10T17:17:14.859Z
 */

class Solution {
    public String sortSentence(String s) {
        String[] parts = s.split(" ");
        String[] res = new String[parts.length];

        for (String w : parts) {
            int len = w.length();
            int idx = w.charAt(len - 1) - '0'; // position (1-based)
            res[idx - 1] = w.substring(0, len - 1); // strip the digit
        }

        return String.join(" ", res);
    }
}
