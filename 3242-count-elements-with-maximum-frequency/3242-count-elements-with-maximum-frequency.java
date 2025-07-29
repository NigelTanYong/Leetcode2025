//Time complexity: O(n), Space complexity: O(1)
class Solution {
    public int maxFrequencyElements(int[] nums) {
        //1.use frequency array to count frequncy
        //2.get the max freqency from freqeuncy array
        //3.count how many elements have this max frequency
        int freqArr[] = new int[101];
        ///1.
        for(int num : nums){
            freqArr[num]++;
        }
        //2.
        int maxFreq = 0;
        for(int count : freqArr){
            maxFreq = Math.max(maxFreq, count);
        }
        //3.
        int result = 0;
        for(int count : freqArr){
            if(count == maxFreq) result+=count;
        }
        return result;
    }
}