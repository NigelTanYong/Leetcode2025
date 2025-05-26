class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int value = target - nums[i]; //get the complement (other value)
            if(map.containsKey(value)){ // check if the complement is already in the hasmap
                return new int[] {i, map.get(value)};
            }
            map.put(nums[i], i); // add into hashmap with value as key and index as value
        }
        return new int[0];
    }
}