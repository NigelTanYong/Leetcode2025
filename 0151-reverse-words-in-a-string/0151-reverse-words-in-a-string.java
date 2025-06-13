//time complexity: O(n), Space complexity: O(n)
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // remove trailing, ending spaces, splits the string into words, using one or more whitespace characters (spaces, tabs, etc.) as the separator
        StringBuilder result = new StringBuilder();

        for(int i = words.length-1; i>=0; i--){
            result.append(words[i]);
            if(i!=0){//if not the last word, add a space
                result.append(" ");
            }
        }
        return result.toString();
    }
}