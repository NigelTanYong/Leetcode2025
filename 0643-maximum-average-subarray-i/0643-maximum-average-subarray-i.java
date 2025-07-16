class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double result=0;
        //edge case
        if(nums.length==0||k<=0) return 0;

        //first loop
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        result =(double)sum/k;

        //sliding window
        for(int s=k; s<nums.length; s++){
            sum+=nums[s];
            sum-=nums[s-k]; //remove the left of the window
            result=Math.max(result, (double)sum/k);
        }
        return result;
    }
}