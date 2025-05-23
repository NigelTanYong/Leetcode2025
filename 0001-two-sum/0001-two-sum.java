class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int value = target-nums[i];
            if(map.containsKey(value)){
                int[] result = new int[2];
                result[0] = map.get(value);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}