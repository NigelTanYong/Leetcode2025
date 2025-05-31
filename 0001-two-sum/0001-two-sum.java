//O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                int[] results = new int[2];
                results[0] = i;
                results[1] = map.get(complement);
                return results;
            }
            map.put(nums[i], i);
        }
        return new int[0];


    }
}