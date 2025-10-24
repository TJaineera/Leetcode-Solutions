/**
 * Title: number-of-students-unable-to-eat-lunch
 * Slug: number-of-students-unable-to-eat-lunch
 * URL: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/?envType=problem-list-v2&envId=queue
 * Language: java
 * Submitted: 2025-10-24T19:34:29.620Z
 */

public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for (int s : students) {
            count[s]++;
        }
        
        for (int sandwich : sandwiches) {
            if (count[sandwich] > 0) {
                count[sandwich]--;
            } else {
                return count[0] + count[1];
            }
        }
        
        return 0;
    }
}
