//divide and conquer, sliding windows 
class Solution {
    // Step 1: Count frequency of each lowercase letter in current string
    // Step 2: Scan through the string to find a "bad" character - bad characters are freq < k
    // Step 3: Split into two subproblems excluding the bad character
    // Step 4: Return the maximum of the two in the recursive function
    // Step 5: If no bad character is found, the whole substring is valid

    public int longestSubstring(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        for (char c : s.toCharArray()){
            freq[c-'a']++; //c-'a' to turn into zero-based index
        }

        for(int i = 0; i < n; i++){
            if(freq[s.charAt(i)-'a']<k){
                int left = longestSubstring(s.substring(0,i),k);
                int right = longestSubstring(s.substring(i+1), k);
                return Math.max(left, right);
            }
        }
        return n;
    }
}