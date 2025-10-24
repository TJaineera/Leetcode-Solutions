/**
 * Title: reveal-cards-in-increasing-order
 * Slug: reveal-cards-in-increasing-order
 * URL: https://leetcode.com/problems/reveal-cards-in-increasing-order/?envType=problem-list-v2&envId=queue
 * Language: java
 * Submitted: 2025-10-24T19:31:39.508Z
 */

public class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);  // Sort deck in ascending order
        
        Deque<Integer> deque = new ArrayDeque<>();
        
        // Process from largest to smallest
        for (int i = n - 1; i >= 0; i--) {
            if (!deque.isEmpty()) {
                // Move bottom card to top
                deque.addFirst(deque.removeLast());
            }
            // Place current largest card on top
            deque.addFirst(deck[i]);
        }
        
        // Convert deque to array
        int[] result = new int[n];
        int index = 0;
        for (int num : deque) {
            result[index++] = num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] deck = {17,13,11,2,3,5,7};
        int[] result = sol.deckRevealedIncreasing(deck);
        System.out.println(Arrays.toString(result));
    }
}
