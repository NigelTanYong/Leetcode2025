//2 pointer approach, time complexity:O(n) , space complexity: O(n)
class Solution {
    public boolean isPalindrome(String s) {
        String lowerCaseAlphaNumOnly = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0, right = lowerCaseAlphaNumOnly.length()-1;

        while(left<right){ //compare till the mid
            if(lowerCaseAlphaNumOnly.charAt(left) != lowerCaseAlphaNumOnly.charAt(right)){
                return false;
            }
            left++;
            right--;
        } 
        return true;
    }
}