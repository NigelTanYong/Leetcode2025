//min heap
//Time complexity: O(n), Space complexity: O(m), freq arrray of size 2*(10^4)+1
class Solution {
    public int findKthLargest(int[] nums, int k) {
        //declare frequency array to store no. of times a num appears
        //for loop - to add frequency count to each num in the array
        //for loop - loop from end of number in the array
        ////check if the number exist by checking frequency is >0
        /////deduct the count from k
        /////check if k is reduce to 0 or negative, return the num
        //otherwise, return -1
        int[] freqNumArr = new int[10000 * 2 + 1];
        for(int num:nums){
            freqNumArr[num+10000]++;//need to offset with 10^4 negative num 
        }
        for(int i=freqNumArr.length-1; i>=0; i--){
            if(freqNumArr[i]>0){
                k-=freqNumArr[i];
                if(k<=0) return i-10000; //remove the offset
            }
        }
        return -1;
    }
}