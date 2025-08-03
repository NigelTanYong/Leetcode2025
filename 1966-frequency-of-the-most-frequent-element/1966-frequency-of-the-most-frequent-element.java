
//sliding window
class Solution {
    public int maxFrequency(int[] nums, int k) {
        //sort array first
        //use 2 pointers
        //variable to store total no., left pointer, max to count moves
        //loop 
        //find total values then minus away if more than k
        Arrays.sort(nums);
        int left=0, max=0;
        long total=0;
        for(int right=0; right<nums.length; right++){
            total+=nums[right];
            while((long) nums[right] * (right-left+1) - total > k){ //sliding
                total=total-nums[left];
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}