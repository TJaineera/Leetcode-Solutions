/**
 * Title: minimum-number-game
 * Slug: minimum-number-game
 * URL: https://leetcode.com/problems/minimum-number-game/submissions/1826182094/?envType=problem-list-v2&envId=sorting
 * Language: java
 * Submitted: 2025-11-10T17:07:19.937Z
 */

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i += 2) {
            result[i] = nums[i + 1];
            result[i + 1] = nums[i];
        }
        return result;
    }
}
