/**
 * Title: apply-transform-over-each-element-in-array
 * Slug: apply-transform-over-each-element-in-array
 * URL: https://leetcode.com/problems/apply-transform-over-each-element-in-array/submissions/1827987767/
 * Language: javascript
 * Submitted: 2025-11-12T16:31:52.125Z
 */

/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const result = [];
    for (let i = 0; i < arr.length; i++) {
        result.push(fn(arr[i], i));
    }
    return result;
};
