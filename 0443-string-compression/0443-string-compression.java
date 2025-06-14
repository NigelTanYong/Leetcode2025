//Two-Pointer In-Place Compression Approach
//Time: O(n) — every character is visited once.
//Space: O(1) — everything in-place; only use variables.
class Solution {
    public int compress(char[] chars) {
        int length = chars.length;
        int compressedLen = 0;

        for(int i = 0; i<length ; i++){
            char c = chars[i]; // store the current character
            int count = 0;
            while (i<length && chars[i] == c){ //traverse till reached the same char
                count++;
                i++;
            }
            if(count == 1) { //when group length is 1
                chars[compressedLen] = c;
                compressedLen++;
             }
            else{
                chars[compressedLen] = c;
                compressedLen++;
                for(char num: Integer.toString(count).toCharArray()){
                    chars[compressedLen] = num;
                    compressedLen++;
                }
            }
            i--; // to negate the i++ in while
        }
        return compressedLen;
    }
}