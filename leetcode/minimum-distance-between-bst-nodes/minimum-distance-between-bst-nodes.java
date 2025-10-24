/**
 * Title: minimum-distance-between-bst-nodes
 * Slug: minimum-distance-between-bst-nodes
 * URL: https://leetcode.com/problems/minimum-distance-between-bst-nodes/?envType=problem-list-v2&envId=binary-search-tree
 * Language: java
 * Submitted: 2025-10-24T16:15:47.973Z
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

class Solution {
    private Integer prev = null;
    private int minDiff = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev);
        }
        prev = node.val;

        inorder(node.right);
    }
}
