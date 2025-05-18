class Solution {
    public String minWindow(String s, String t) {
         if (s == null || t == null || s.length() < t.length()) return "";

        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int required = tFreq.size();
        int formed = 0;

        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (tFreq.containsKey(c) && window.get(c).intValue() == tFreq.get(c).intValue()) {
                formed++;
            }

            // Shrink the window from the left if it's valid
            while (formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (tFreq.containsKey(leftChar) && window.get(leftChar).intValue() < tFreq.get(leftChar).intValue()) {
                    formed--;
                }
                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}