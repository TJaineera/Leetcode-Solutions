/**
 * Title: text-justification
 * Slug: text-justification
 * URL: https://leetcode.com/problems/text-justification/?envType=problem-list-v2&envId=string
 * Language: java
 * Submitted: 2025-10-21T18:26:46.448Z
 */

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        int numLetters = 0;

        for (String w : words) {
            if (numLetters + w.length() + cur.size() > maxWidth) {
                int spaces = maxWidth - numLetters;
                int gaps = cur.size() - 1;
                if (gaps == 0) gaps = 1;
                for (int i = 0; i < spaces; i++) {
                    cur.set(i % gaps, cur.get(i % gaps) + " ");
                }
                res.add(String.join("", cur));
                cur.clear();
                numLetters = 0;
            }
            cur.add(w);
            numLetters += w.length();
        }

        // last line → left-justified
        String last = String.join(" ", cur);
        while (last.length() < maxWidth) last += " ";
        res.add(last);

        return res;
    }
}