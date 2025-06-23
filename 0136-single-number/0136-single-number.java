//time and space complexity: O(n)
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numFreqMap = new HashMap<>();
        for(int num : nums){
            numFreqMap.put(num, numFreqMap.getOrDefault(num,0)+1);
        }
        for(int num : nums){
           if(numFreqMap.get(num) == 1) return num;
        }
        return -1;
    }
}