/**
 * Title: longest-common-prefix
 * Slug: longest-common-prefix
 * URL: https://leetcode.com/problems/longest-common-prefix/?envType=problem-list-v2&envId=array
 * Language: java
 * Submitted: 2025-10-21T16:05:42.031Z
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i); // Return prefix up to this point
                }
            }
        }
        return strs[0]; // Entire first string is the common prefix
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(solution.longestCommonPrefix(strs2)); // Output: ""

        String[] strs3 = {"interstellar", "internet", "internal"};
        System.out.println(solution.longestCommonPrefix(strs3)); // Output: "inte"
    }
}
