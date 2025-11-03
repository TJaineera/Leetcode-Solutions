/**
 * Title: different-ways-to-add-parentheses
 * Slug: different-ways-to-add-parentheses
 * URL: https://leetcode.com/problems/different-ways-to-add-parentheses/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-11-03T19:46:35.369Z
 */

import java.util.*;

class Solution {
    Map<String, List<Integer>> memo = new HashMap<>();

    public List<Integer> diffWaysToCompute(String expression) {
        if (memo.containsKey(expression))
            return memo.get(expression);

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left  = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));

                for (int a : left) {
                    for (int b : right) {
                        if (c == '+') result.add(a + b);
                        else if (c == '-') result.add(a - b);
                        else result.add(a * b);
                    }
                }
            }
        }

        if (result.isEmpty())
            result.add(Integer.parseInt(expression));

        memo.put(expression, result);
        return result;
    }
}
