class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        int count = s.length();
        int[] map = new int[128]; //ASCII
        if(s.length() <= 0){
            return 0;
        }

        while (right < s.length()){
            char rightChar = s.charAt(right);
            map[rightChar]++;

            while(map[rightChar] > 1){ //duplcate char
                char leftChar = s.charAt(left);
                map[leftChar]--; //shrink window from left to potentially remove the duplicate
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;   
    }
}