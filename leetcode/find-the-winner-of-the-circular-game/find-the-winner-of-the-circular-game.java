/**
 * Title: 🙋‍♂️ Those who comes early morning to solve daily challenge
 * Slug: find-the-winner-of-the-circular-game
 * URL: https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/?envType=problem-list-v2&envId=queue
 * Language: java
 * Submitted: 2025-10-24T19:33:20.132Z
 */

public class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }
        
        int index = 0;
        while (circle.size() > 1) {
            index = (index + k - 1) % circle.size(); // find k-th person
            circle.remove(index); // eliminate
        }
        
        return circle.get(0); // winner
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int winner = sol.findTheWinner(5, 2); // example
        System.out.println(winner); // Output: 3
    }
}
