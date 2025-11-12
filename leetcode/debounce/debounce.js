/**
 * Title: Explanation:
 * Slug: debounce
 * URL: https://leetcode.com/problems/debounce/submissions/1827981755/
 * Language: javascript
 * Submitted: 2025-11-12T16:25:20.626Z
 */

/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
function debounce(fn, t) {
    let timeoutId = null;
    return function(...args) {
        if (timeoutId !== null) {
            clearTimeout(timeoutId);
        }
        timeoutId = setTimeout(() => {
            fn.apply(this, args);
        }, t);
    };
}

/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */