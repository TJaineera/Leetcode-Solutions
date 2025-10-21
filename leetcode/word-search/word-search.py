/**
 * Title: word-search
 * Slug: word-search
 * URL: https://leetcode.com/problems/word-search/
 * Language: python
 * Submitted: 2025-10-21T18:51:38.524Z
 */

class Solution(object):
    def exist(self, board, word):
        R, C = len(board), len(board[0])

        def dfs(r, c, k):
            if k == len(word): 
                return True
            if r < 0 or r >= R or c < 0 or c >= C or board[r][c] != word[k]:
                return False
            ch = board[r][c]
            board[r][c] = "#"  # mark visited
            found = (dfs(r+1,c,k+1) or dfs(r-1,c,k+1) or
                     dfs(r,c+1,k+1) or dfs(r,c-1,k+1))
            board[r][c] = ch     # unmark
            return found

        # small pruning: if impossible by counts, early return
        from collections import Counter
        cnt = Counter(sum(board, []))
        if Counter(word)[word[0]] > cnt.get(word[0], 0) or any(Counter(word)[ch] > cnt.get(ch, 0) for ch in set(word)):
            return False
        # even better: reverse word if tail is rarer (reduces branching)
        if cnt.get(word[0], 0) > cnt.get(word[-1], 0):
            word = word[::-1]

        for r in range(R):
            for c in range(C):
                if board[r][c] == word[0] and dfs(r, c, 0):
                    return True
        return False
