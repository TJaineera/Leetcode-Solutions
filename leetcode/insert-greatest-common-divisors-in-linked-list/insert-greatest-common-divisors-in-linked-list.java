/**
 * Title: insert-greatest-common-divisors-in-linked-list
 * Slug: insert-greatest-common-divisors-in-linked-list
 * URL: https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/submissions/1814449476/?envType=problem-list-v2&envId=math
 * Language: java
 * Submitted: 2025-10-28T21:02:47.631Z
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode curr = head;
        while (curr != null && curr.next != null) {
            int gcdVal = gcd(curr.val, curr.next.val);
            ListNode gcdNode = new ListNode(gcdVal);

            // Insert the gcd node between curr and curr.next
            gcdNode.next = curr.next;
            curr.next = gcdNode;

            // Move to the next original node (skip gcd node)
            curr = gcdNode.next;
        }
        return head;
    }

    // Euclidean algorithm for GCD
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
