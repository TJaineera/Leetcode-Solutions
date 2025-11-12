/**
 * Title: Beats 99.56% ❇️ of js users with 36 ms runtime 😁
 * Slug: allow-one-function-call
 * URL: https://leetcode.com/problems/allow-one-function-call/submissions/1827987270/
 * Language: javascript
 * Submitted: 2025-11-12T16:31:22.391Z
 */

/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    let called = false;
    let result;

    return function(...args) {
        if (!called) {
            called = true;
            result = fn(...args);
            return result;
        }
        return undefined;
    };
};


/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
