/**
 * Title: array-wrapper
 * Slug: array-wrapper
 * URL: https://leetcode.com/problems/array-wrapper/submissions/1827984853/
 * Language: javascript
 * Submitted: 2025-11-12T16:28:40.747Z
 */

class ArrayWrapper {
  constructor(nums) {
    this.nums = nums;
  }

  valueOf() {
    return this.nums.reduce((sum, n) => sum + n, 0);
  }

  toString() {
    return `[${this.nums.join(',')}]`;
  }
}


/**
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */