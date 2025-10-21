/**
 * Title: simplify-path
 * Slug: simplify-path
 * URL: https://leetcode.com/problems/simplify-path/?envType=problem-list-v2&envId=string
 * Language: python
 * Submitted: 2025-10-21T18:28:11.638Z
 */

class Solution(object):
    def simplifyPath(self, path):
        """
        :type path: str
        :rtype: str
        """
        stack = []
        for part in path.split('/'):
            if part == '' or part == '.':
                continue
            if part == '..':
                if stack:
                    stack.pop()
            else:
                stack.append(part)
        return '/' + '/'.join(stack)
