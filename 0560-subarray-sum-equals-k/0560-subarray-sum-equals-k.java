//time and space complexity: O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); //store the prefix sum and no.of time sum has appear
        int sum = 0, count =0;

        for(int i =0; i<nums.length; i++){
            sum+=nums[i];
            if(sum == k){ //first time it equals k
                count++;
            }

            int complement = sum - k;
            if(map.containsKey(complement)){ //if contain prefix sum -k
                count += map.get(complement);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}