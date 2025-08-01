// Time Complexity: O(n), space complexity; O(1)
class Solution {
    public String frequencySort(String s) {
        //use a freq array
        //Assume ASCII, then only have 128 characters
        //for loop - loop through char and calculate frequency for each char
        //use stringBuilder to build result string
        //outer for loop - with variables to store max freq and tracks max int of char
        ////for loop that go through index 1 to 128
        //////check if current freq is > previously stored max
        //////for loop to make new string
        //////reset the freq of each max int of char

        int freqArr[] = new int[128];
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            freqArr[c]++;
        }

        for(int i=0; i<s.length(); i++){ //O(n)
            int maxFreq = freqArr[0]; //0 is null in ascii
            int maxIndex = 0;

            for(int j=1; j<128; j++){ //o(128)
                if(freqArr[j]>maxFreq){
                    maxFreq=freqArr[j];
                    maxIndex = j; //int value of char with max
                }
            }
            for(int k=0; k<maxFreq; k++){ //0(maxFreq)
                sb.append((char)maxIndex);
            }
            freqArr[maxIndex] = 0; //reset so other char can be largest
        }
        return sb.toString();
    }
}