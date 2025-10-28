/**
 * Title: count-sorted-vowel-strings
 * Slug: count-sorted-vowel-strings
 * URL: https://leetcode.com/problems/count-sorted-vowel-strings/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-10-28T16:58:54.431Z
 */

class Solution {
    public int countVowelStrings(int n) {
        // number of non-decreasing sequences of length n from 5 vowels
        // formula: C(n + 5 - 1, 5 - 1) = C(n + 4, 4)
        int a = n + 4;
        int b = 4;
        long res = 1;
        for (int i = 1; i <= b; i++) {
            res = res * (a - i + 1) / i;
        }
        return (int) res;
    }
}
