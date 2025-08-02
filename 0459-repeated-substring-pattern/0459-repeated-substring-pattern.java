//Time and Space Complexity: O(n)
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        //intuition: if s = p + p + ... + p, then when you do s + s and remove first & last character, at least one copy of s will appear shifted inside.
        
        //first make a doubled repeat of s
        //substring from the second letter to second last
        //if contains s in the substring, then there exist the repeated substring
        String doubledS = s+s;
        String subString = doubledS.substring(1, doubledS.length()-1);
        return subString.contains(s);
    }
}