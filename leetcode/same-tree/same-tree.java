/**
 * Title: same-tree
 * Slug: same-tree
 * URL: https://leetcode.com/problems/same-tree/submissions/1810534003/
 * Language: java
 * Submitted: 2025-10-24T16:55:52.697Z
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(p);
        stack.push(q);

        while (!stack.isEmpty()) {
            TreeNode node2 = stack.pop();
            TreeNode node1 = stack.pop();

            if (node1 == null && node2 == null) continue;
            if (node1 == null || node2 == null) return false;
            if (node1.val != node2.val) return false;

            // Push children in order: left and right
            stack.push(node1.right);
            stack.push(node2.right);
            stack.push(node1.left);
            stack.push(node2.left);
        }

        return true;
    }
}

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
