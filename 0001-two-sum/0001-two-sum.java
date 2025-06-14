//O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(hm.containsKey(complement)){
                int[] result = new int[2];
                result[0] = hm.get(complement);
                result[1] = i;
                return result;
            }
            hm.put(nums[i],i);
        }
        return new int[0];
    }
}