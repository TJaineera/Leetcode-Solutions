/**
 * Title: fibonacci-number
 * Slug: fibonacci-number
 * URL: https://leetcode.com/problems/fibonacci-number/?envType=problem-list-v2&envId=dynamic-programming
 * Language: python
 * Submitted: 2025-10-22T17:51:56.007Z
 */

class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n < 2: 
            return n
        a, b = 0, 1
        for _ in range(2, n + 1):
            a, b = b, a + b
        return b
