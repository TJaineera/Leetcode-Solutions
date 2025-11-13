/**
 * Title: remove-outermost-parentheses
 * Slug: remove-outermost-parentheses
 * URL: https://leetcode.com/problems/remove-outermost-parentheses/submissions/1829136705/?envType=problem-list-v2&envId=stack
 * Language: java
 * Submitted: 2025-11-13T22:13:35.697Z
 */

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) result.append(c);
                balance++;
            } else {
                balance--;
                if (balance > 0) result.append(c);
            }
        }
        return result.toString();
    }
}
