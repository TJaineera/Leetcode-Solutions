/**
 * Title: number-of-recent-calls
 * Slug: number-of-recent-calls
 * URL: https://leetcode.com/problems/number-of-recent-calls/?envType=problem-list-v2&envId=design
 * Language: java
 * Submitted: 2025-10-24T16:47:28.724Z
 */

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.offer(t); // add new request
        // remove all requests older than t - 3000
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
