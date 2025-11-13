/**
 * Title: reverse-prefix-of-word
 * Slug: reverse-prefix-of-word
 * URL: https://leetcode.com/problems/reverse-prefix-of-word/submissions/1829137302/?envType=problem-list-v2&envId=stack
 * Language: java
 * Submitted: 2025-11-13T22:15:11.629Z
 */

class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) return word;  // ch not found

        char[] arr = word.toCharArray();
        int left = 0, right = idx;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }
}
