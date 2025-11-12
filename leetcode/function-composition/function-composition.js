/**
 * Title: function-composition
 * Slug: function-composition
 * URL: https://leetcode.com/problems/function-composition/
 * Language: javascript
 * Submitted: 2025-11-12T16:30:39.212Z
 */

/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    return function(x) {
        // apply from rightmost function to leftmost
        for (let i = functions.length - 1; i >= 0; i--) {
            x = functions[i](x);
        }
        return x;
    };
};
