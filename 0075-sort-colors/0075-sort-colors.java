//Space complexity: O(1)
//time Complexity: O(n)
class Solution {
    public void sortColors(int[] nums) {
        //index to follow through final array
        //use counter to count freqency of each colour
        //set colours accordingly
        int index=0;
        int redCount=0, whiteCount=0, blueCount=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                redCount++;
            else if(nums[i]==1)
                whiteCount++;
            else
                blueCount++;
        }

        while(redCount!=0){
            nums[index]=0;
            redCount--;
            index++;
        }
        while(whiteCount!=0){
            nums[index]=1;
            whiteCount--;
            index++;
        }
        while(blueCount!=0){
            nums[index]=2;
            blueCount--;
            index++;
        }
    }
}