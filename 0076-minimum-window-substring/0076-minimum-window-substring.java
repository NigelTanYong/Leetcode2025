class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length())
            return "";
        int[] map = new int[128]; //ASCII size
        int count = t.length();
        int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE;

        for (char c : t.toCharArray())
            map[c]++; // e.g. map['A'] = map['A'] + 1

        while (end < s.length()) { //expanding windows
            char currentChar = s.charAt(end);
            end++;
            if (map[currentChar] > 0) {
                count--;
            }
            map[currentChar]--;

            while (count == 0) { // when all t are included in the window, reduce window size
                if (end - start < minLen) {
                    minStart = start;
                    minLen = end - start;
                }

                currentChar = s.charAt(start);
                start++;
                if (map[currentChar] == 0) {
                    count++;
                }
                map[currentChar]++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}