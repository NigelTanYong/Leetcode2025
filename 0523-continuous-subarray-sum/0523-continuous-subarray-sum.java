//Hashmap + modulo approach
// Time Complexity: O(n)
//Space Complexity: O(n)
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> remainderMap = new HashMap<>(); //key: remainder of sum/k, value: index
        remainderMap.put(0,-1); //handle where subarray starts from index 0 -- for the if condition in loop later 
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int remainder = sum%k;

            if(remainderMap.containsKey(remainder)){ //means sum is multiple
                if(i - remainderMap.get(remainder) >=2 ){ // make sure sub array is 2 or more
                    return true;
                }
            }
            else{
                remainderMap.put(remainder, i);
            }
        }
        return false;
    }
}