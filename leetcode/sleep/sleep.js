/**
 * Title: sleep
 * Slug: sleep
 * URL: https://leetcode.com/problems/sleep/submissions/1827985804/
 * Language: javascript
 * Submitted: 2025-11-12T16:29:44.614Z
 */

/**
 * @param {number} millis
 * @return {Promise<void>}
 */
async function sleep(millis) {
    return new Promise(resolve => setTimeout(resolve, millis));
}
