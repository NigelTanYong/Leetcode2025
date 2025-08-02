//Time complexity: O(logn)
//Space complexity: O(1)
class Solution {
    public int findPeakElement(int[] nums) {
        //use 2 pointer
        //calculate mid
        //if num[mid] > num[mid+1] right decreases index
        // else left increase index
        int left=0, right=nums.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]<nums[mid+1]){
                left = mid+1; //shift up
            }
            else{
                right = mid; //shift down
            }
        }
        return left;
    }
}