/**
 * Title: find-mode-in-binary-search-tree
 * Slug: find-mode-in-binary-search-tree
 * URL: https://leetcode.com/problems/find-mode-in-binary-search-tree/?envType=problem-list-v2&envId=binary-search-tree
 * Language: java
 * Submitted: 2025-10-24T16:11:02.492Z
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
    private int count = 0;
    private int maxCount = 0;
    private List<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);
        // Convert list to array
        int[] res = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            res[i] = modes.get(i);
        }
        return res;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        // Count frequency
        if (prev == null || node.val != prev) {
            count = 1;
        } else {
            count++;
        }

        // Update maxCount and modes list
        if (count > maxCount) {
            maxCount = count;
            modes.clear();
            modes.add(node.val);
        } else if (count == maxCount) {
            modes.add(node.val);
        }

        prev = node.val;

        inorder(node.right);
    }
}
