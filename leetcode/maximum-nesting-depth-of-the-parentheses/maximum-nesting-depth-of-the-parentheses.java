/**
 * Title: maximum-nesting-depth-of-the-parentheses
 * Slug: maximum-nesting-depth-of-the-parentheses
 * URL: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/submissions/1829137990/?envType=problem-list-v2&envId=stack
 * Language: java
 * Submitted: 2025-11-13T22:16:53.923Z
 */

class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth++;
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            } else if (c == ')') {
                depth--;
            }
        }

        return maxDepth;
    }
}
