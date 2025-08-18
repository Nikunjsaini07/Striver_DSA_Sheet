class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ans = new HashSet<>();
        int start=0;
        int end=0;
        int max  = 0;
        while (end < s.length()) {
            char c = s.charAt(end);
            while (start < end && ans.contains(c)) {
                ans.remove(s.charAt(start++));
            }
            ans.add(c);
            max = Math.max(end-start+1, max);
            end++;
        }
        return max;
    }
}}
