/**
 * Title: design-hashmap
 * Slug: design-hashmap
 * URL: https://leetcode.com/problems/design-hashmap/submissions/1810525433/?envType=problem-list-v2&envId=design
 * Language: java
 * Submitted: 2025-10-24T16:46:36.869Z
 */

class MyHashMap {
    private int[] map;

    public MyHashMap() {
        map = new int[1000001]; // keys 0 to 10^6
        Arrays.fill(map, -1);   // -1 indicates no mapping
    }
    
    public void put(int key, int value) {
        map[key] = value;
    }
    
    public int get(int key) {
        return map[key];
    }
    
    public void remove(int key) {
        map[key] = -1;
    }
}
