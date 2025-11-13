/**
 * Title: Approach
 * Slug: construct-binary-search-tree-from-preorder-traversal
 * URL: https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/submissions/1829138242/?envType=problem-list-v2&envId=stack
 * Language: java
 * Submitted: 2025-11-13T22:17:31.439Z
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
    int idx = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, int low, int high) {
        if (idx == preorder.length) return null;

        int val = preorder[idx];
        if (val < low || val > high) return null;

        idx++;
        TreeNode root = new TreeNode(val);
        root.left = build(preorder, low, val - 1);
        root.right = build(preorder, val + 1, high);
        return root;
    }
}
