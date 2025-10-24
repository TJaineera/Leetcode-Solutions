/**
 * Title: BFS + twoSum and a boolean output
 * Slug: two-sum-iv-input-is-a-bst
 * URL: https://leetcode.com/problems/two-sum-iv-input-is-a-bst/?envType=problem-list-v2&envId=binary-search-tree
 * Language: java
 * Submitted: 2025-10-24T16:12:53.568Z
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import java.util.*;

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return dfs(root, set, k);
    }

    private boolean dfs(TreeNode node, Set<Integer> set, int k) {
        if (node == null) return false;

        if (set.contains(k - node.val)) {
            return true;
        }
        set.add(node.val);

        // Search in left or right subtree
        return dfs(node.left, set, k) || dfs(node.right, set, k);
    }
}
