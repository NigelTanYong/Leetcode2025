// 2 pointer approach
//Time complexity: O(n), Space Complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int p = 1; // pointer set one cuz there is at least 1 unique if nums.length  = 1
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] != nums[p-1]){
                nums[p] = nums[i]; //if current not same as pointer, set to pointer index
                p++;
            }
        }
        return p;
    }
}