/**
 * Title: New Difficulty Level
 * Slug: convert-the-temperature
 * URL: https://leetcode.com/problems/convert-the-temperature/?envType=problem-list-v2&envId=math
 * Language: java
 * Submitted: 2025-10-28T21:06:56.832Z
 */

class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{ kelvin, fahrenheit };
    }
}
