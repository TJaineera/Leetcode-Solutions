/**
 * Title: text-justification
 * Slug: text-justification
 * URL: https://leetcode.com/problems/text-justification/?envType=problem-list-v2&envId=string
 * Language: python
 * Submitted: 2025-10-21T18:26:08.373Z
 */

class Solution(object):
    def fullJustify(self, words, maxWidth):
        """
        :type words: List[str]
        :type maxWidth: int
        :rtype: List[str]
        """
        res, cur, num_of_letters = [], [], 0

        for w in words:
            if num_of_letters + len(w) + len(cur) > maxWidth:
                for i in range(maxWidth - num_of_letters):
                    cur[i % (len(cur) - 1 or 1)] += ' '
                res.append(''.join(cur))
                cur, num_of_letters = [], 0
            cur += [w]
            num_of_letters += len(w)

        res.append(' '.join(cur).ljust(maxWidth))
        return res
