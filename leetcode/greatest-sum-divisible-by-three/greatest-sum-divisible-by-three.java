/**
 * Title: greatest-sum-divisible-by-three
 * Slug: greatest-sum-divisible-by-three
 * URL: https://leetcode.com/problems/greatest-sum-divisible-by-three/submissions/1814267542/?envType=problem-list-v2&envId=dynamic-programming
 * Language: java
 * Submitted: 2025-10-28T17:05:56.693Z
 */

class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;

        // Track up to two smallest nums with remainder 1 and remainder 2
        List<Integer> rem1 = new ArrayList<>();
        List<Integer> rem2 = new ArrayList<>();

        for (int x : nums) {
            sum += x;
            int r = x % 3;
            if (r == 1) {
                rem1.add(x);
            } else if (r == 2) {
                rem2.add(x);
            }
        }

        // sort so we can grab the smallest 1 or 2 from each list
        Collections.sort(rem1);
        Collections.sort(rem2);

        if (sum % 3 == 0) {
            return sum;
        } else if (sum % 3 == 1) {
            // Option A: remove smallest remainder-1
            int optionA = Integer.MAX_VALUE;
            if (rem1.size() >= 1) {
                optionA = rem1.get(0);
            }

            // Option B: remove two smallest remainder-2
            int optionB = Integer.MAX_VALUE;
            if (rem2.size() >= 2) {
                optionB = rem2.get(0) + rem2.get(1);
            }

            int toRemove = Math.min(optionA, optionB);
            if (toRemove == Integer.MAX_VALUE) return 0; // can't fix
            return sum - toRemove;

        } else { // sum % 3 == 2
            // Option A: remove smallest remainder-2
            int optionA = Integer.MAX_VALUE;
            if (rem2.size() >= 1) {
                optionA = rem2.get(0);
            }

            // Option B: remove two smallest remainder-1
            int optionB = Integer.MAX_VALUE;
            if (rem1.size() >= 2) {
                optionB = rem1.get(0) + rem1.get(1);
            }

            int toRemove = Math.min(optionA, optionB);
            if (toRemove == Integer.MAX_VALUE) return 0; // can't fix
            return sum - toRemove;
        }
    }
}
