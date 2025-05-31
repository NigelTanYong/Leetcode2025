// O(n)
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();
        int i = 0;

        StringBuilder result = new StringBuilder();

        while (i < word1Len || i < word2Len) {
            if (i < word1Len)
                result.append(word1.charAt(i));
            if (i < word2Len)
                result.append(word2.charAt(i));
            i++;
        }
        
        return result.toString();

    }
}