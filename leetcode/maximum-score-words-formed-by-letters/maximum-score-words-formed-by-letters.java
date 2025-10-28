/**
 * Title: maximum-score-words-formed-by-letters
 * Slug: maximum-score-words-formed-by-letters
 * URL: https://leetcode.com/problems/maximum-score-words-formed-by-letters/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-10-28T16:12:54.683Z
 */

class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] letterCount = new int[26];
        for (char c : letters) {
            letterCount[c - 'a']++;
        }
        return backtrack(words, letterCount, score, 0);
    }

    private int backtrack(String[] words, int[] letterCount, int[] score, int index) {
        if (index == words.length) return 0;

        // Option 1: skip current word
        int maxScore = backtrack(words, letterCount, score, index + 1);

        // Option 2: try to include current word (if possible)
        int wordScore = 0;
        boolean canUse = true;
        int[] used = new int[26];
        
        for (char c : words[index].toCharArray()) {
            int i = c - 'a';
            used[i]++;
            if (used[i] > letterCount[i]) {
                canUse = false;
            }
            wordScore += score[i];
        }

        if (canUse) {
            // temporarily use these letters
            for (int i = 0; i < 26; i++) {
                letterCount[i] -= used[i];
            }
            maxScore = Math.max(maxScore, wordScore + backtrack(words, letterCount, score, index + 1));
            // backtrack (restore)
            for (int i = 0; i < 26; i++) {
                letterCount[i] += used[i];
            }
        }

        return maxScore;
    }
}
