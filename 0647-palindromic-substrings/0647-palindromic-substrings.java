class Solution {
    public int countSubstrings(String s) {
        if (s.length() == 0){
            return 0;
        }
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            int left = i, right = i; //i is center
            //handles odd length palindromes
            while(left >= 0 && right<s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
            //handles even length palidromes
            left = i; 
            right = i+1;
            while(left >= 0 && right<s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }
        return count;

    }
}