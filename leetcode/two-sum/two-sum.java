/**
 * Title: two-sum
 * Slug: two-sum
 * URL: https://leetcode.com/problems/two-sum/description/
 * Language: java
 * Submitted: 2025-10-20T19:59:44.654Z
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length - 1; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
                        return new int[]{};

    }
}        

