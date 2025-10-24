/**
 * Title: kth-largest-element-in-a-stream
 * Slug: kth-largest-element-in-a-stream
 * URL: https://leetcode.com/problems/kth-largest-element-in-a-stream/?envType=problem-list-v2&envId=binary-search-tree
 * Language: java
 * Submitted: 2025-10-24T16:15:08.574Z
 */

import java.util.PriorityQueue;

class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();

        // Initialize the heap with the given numbers
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) {
            minHeap.poll();  // remove the smallest to keep size = k
        }
        return minHeap.peek();  // top element is the kth largest
    }
}
