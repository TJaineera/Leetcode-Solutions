/**
 * Title: remove-duplicates-from-sorted-list
 * Slug: remove-duplicates-from-sorted-list
 * URL: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Language: java
 * Submitted: 2025-10-24T16:53:58.109Z
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
