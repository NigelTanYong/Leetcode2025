// Time and Space complexity: O(n)
class Solution {
    public void rotate(int[] nums, int k) {
        int numsLen = nums.length;
        int[] rotated = new int[numsLen];
        k %= numsLen;// for case when k >=n
        
        for(int i = 0; i < numsLen; i++){ //rotated array
            rotated[(i+k) % numsLen] = nums[i];
        }
        
        for(int i = 0; i < numsLen; i++){
            nums[i] = rotated[i];
        }
    }
}