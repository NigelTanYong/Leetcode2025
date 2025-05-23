class Solution {
    public boolean isPalindrome(String s) {
        String alphaStrOnly = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0, right = alphaStrOnly.length()-1;

        while (left<right){
            if(alphaStrOnly.charAt(left) != alphaStrOnly.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}