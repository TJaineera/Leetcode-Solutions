/**
 * Title: Explanation:
 * Slug: add-two-promises
 * URL: https://leetcode.com/problems/add-two-promises/submissions/1827982970/
 * Language: javascript
 * Submitted: 2025-11-12T16:26:34.918Z
 */

/**
 * @param {Promise<number>} promise1
 * @param {Promise<number>} promise2
 * @return {Promise<number>}
 */
async function addTwoPromises(promise1, promise2) {
  const [a, b] = await Promise.all([promise1, promise2]);
  return a + b;
}


/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */