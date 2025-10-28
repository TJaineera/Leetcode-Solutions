/**
 * Title: convert-date-to-binary
 * Slug: convert-date-to-binary
 * URL: https://leetcode.com/problems/convert-date-to-binary/?envType=problem-list-v2&envId=math
 * Language: java
 * Submitted: 2025-10-28T21:08:51.167Z
 */

class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        return Integer.toBinaryString(year) + "-" +
               Integer.toBinaryString(month) + "-" +
               Integer.toBinaryString(day);
    }
}
