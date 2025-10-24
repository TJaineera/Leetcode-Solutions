/**
 * Title: range-sum-of-bst
 * Slug: range-sum-of-bst
 * URL: https://leetcode.com/problems/range-sum-of-bst/?envType=problem-list-v2&envId=binary-search-tree
 * Language: java
 * Submitted: 2025-10-24T16:16:58.492Z
 */

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (node.val >= low && node.val <= high) {
                    sum += node.val;
                }
                if (node.val > low) stack.push(node.left);
                if (node.val < high) stack.push(node.right);
            }
        }
        return sum;
    }
}
