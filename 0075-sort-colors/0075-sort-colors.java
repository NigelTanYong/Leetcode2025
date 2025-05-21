class Solution {
    public void sortColors(int[] nums) {
        int t = 0;
        int redCount = 0, whiteCount = 0, blueCount =0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                redCount++;
            }
            else if(nums[i] == 1){
                whiteCount++;
            }
            else{
                blueCount++;
            }
        }
        while(redCount != 0){
            nums[t] = 0;
            t++;
            redCount--;
        }
        while(whiteCount !=0){
            nums[t] = 1;
            t++;
            whiteCount--;
        }
        while(blueCount !=0){
            nums[t] = 2;
            t++;
            blueCount--;
        }

    }
}