/**
 * Title: simplify-path
 * Slug: simplify-path
 * URL: https://leetcode.com/problems/simplify-path/?envType=problem-list-v2&envId=string
 * Language: java
 * Submitted: 2025-10-21T18:28:52.634Z
 */


class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        for (String part : path.split("/")) {
            if (part.isEmpty() || part.equals(".")) continue;
            if (part.equals("..")) {
                if (!stack.isEmpty()) stack.pollLast();
            } else {
                stack.offerLast(part);
            }
        }
        if (stack.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for (String s : stack) sb.append('/').append(s);
        return sb.toString();
    }
}