/**
 * Title: median-of-two-sorted-arrays
 * Slug: median-of-two-sorted-arrays
 * URL: https://leetcode.com/problems/median-of-two-sorted-arrays/?envType=problem-list-v2&envId=array
 * Language: java
 * Submitted: 2025-10-21T16:05:18.381Z
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums[] = new int[nums1.length + nums2.length];
        for(int i=0; i<nums1.length; i++){
            nums[i] = nums1[i];
        }
        for(int i=0; i<nums2.length; i++){
            nums[i + nums1.length] = nums2[i];
        }
        Arrays.sort(nums);
        double x = 0;
        if(nums.length%2==0){
            double w = nums[nums.length/2 - 1];
            double y = nums[nums.length/2];
            x = (w+y)/2;
        }
        else{
            x = nums[nums.length/2];
        }
        return x;
    }
}