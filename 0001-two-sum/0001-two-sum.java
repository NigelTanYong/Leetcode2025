//Time and Space complexity: O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //init hashmap key as number, value as index
        //for loop i=0 to <nums.length
        ////get complement of each number: target - num[i]
        ////if hashmap contains complement, save result in array and retrun
        ////put key=nums[i], value=i
        //return empty array if don't have sum
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(hm.containsKey(complement)){
                int[] result = new int[2];
                result[0]=i;
                result[1]=hm.get(complement);
                return result;
            }
            hm.put(nums[i],i);
        }
        return new int[2];
    }

}