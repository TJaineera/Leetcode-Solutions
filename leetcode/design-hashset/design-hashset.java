/**
 * Title: design-hashset
 * Slug: design-hashset
 * URL: https://leetcode.com/problems/design-hashset/?envType=problem-list-v2&envId=design
 * Language: java
 * Submitted: 2025-10-24T16:45:38.944Z
 */

class MyHashSet {
    private boolean[] set;

    public MyHashSet() {
        set = new boolean[1000001]; // keys from 0 to 10^6
    }
    
    public void add(int key) {
        set[key] = true;
    }
    
    public void remove(int key) {
        set[key] = false;
    }
    
    public boolean contains(int key) {
        return set[key];
    }
}
