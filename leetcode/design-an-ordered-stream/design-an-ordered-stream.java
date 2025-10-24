/**
 * Title: design-an-ordered-stream
 * Slug: design-an-ordered-stream
 * URL: https://leetcode.com/problems/design-an-ordered-stream/?envType=problem-list-v2&envId=design
 * Language: java
 * Submitted: 2025-10-24T16:48:48.334Z
 */

class OrderedStream {
    private String[] stream;
    private int ptr;

    public OrderedStream(int n) {
        stream = new String[n + 1]; // 1-based indexing
        ptr = 1;
    }
    
    public List<String> insert(int idKey, String value) {
        stream[idKey] = value;
        List<String> result = new ArrayList<>();
        while (ptr < stream.length && stream[ptr] != null) {
            result.add(stream[ptr]);
            ptr++;
        }
        return result;
    }
}
