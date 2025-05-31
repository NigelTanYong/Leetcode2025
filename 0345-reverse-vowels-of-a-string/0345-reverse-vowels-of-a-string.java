class Solution {
    public String reverseVowels(String s) {
        StringBuilder result = new StringBuilder();
        char[] sChar = s.toCharArray();
        int left = 0, right = s.length()-1;
        final String VOWELS = "aeiouAEIOU";

        while (left<right){
            //until points to a vowel
            while(left<right && VOWELS.indexOf(sChar[left]) == -1){
                left++;
            }
            while (left<right && VOWELS.indexOf(sChar[right]) == -1){
                right--;
            }

            //swap vowels
            char temp = sChar[left];
            sChar[left] = sChar[right];
            sChar[right] = temp;

            left++;
            right--;

        }
        return new String(sChar);

    }
}