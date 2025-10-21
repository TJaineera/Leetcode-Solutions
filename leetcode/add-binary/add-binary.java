/**
 * Title: add-binary
 * Slug: add-binary
 * URL: https://leetcode.com/problems/add-binary/?envType=problem-list-v2&envId=string
 * Language: java
 * Submitted: 2025-10-21T18:24:19.507Z
 */

class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();
    }
}
