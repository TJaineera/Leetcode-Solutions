/**
 * Title: add-binary
 * Slug: add-binary
 * URL: https://leetcode.com/problems/add-binary/?envType=problem-list-v2&envId=string
 * Language: python
 * Submitted: 2025-10-21T18:23:54.058Z
 */

class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        i, j = len(a) - 1, len(b) - 1
        carry = 0
        res = []

        while i >= 0 or j >= 0 or carry:
            total = carry
            if i >= 0:
                total += int(a[i])
                i -= 1
            if j >= 0:
                total += int(b[j])
                j -= 1
            res.append(str(total % 2))
            carry = total // 2

        return ''.join(reversed(res))
