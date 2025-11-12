/**
 * Title: return-length-of-arguments-passed
 * Slug: return-length-of-arguments-passed
 * URL: https://leetcode.com/problems/return-length-of-arguments-passed/
 * Language: javascript
 * Submitted: 2025-11-12T16:21:54.839Z
 */

/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */