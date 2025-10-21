/**
 * Title: container-with-most-water
 * Slug: container-with-most-water
 * URL: https://leetcode.com/problems/container-with-most-water/?envType=problem-list-v2&envId=array
 * Language: java
 * Submitted: 2025-10-21T16:05:28.716Z
 */

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            maxWater = Math.max(maxWater, minHeight * width);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] height1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(height1)); // Output: 49

        int[] height2 = {1,1};
        System.out.println(solution.maxArea(height2)); // Output: 1
    }
}
