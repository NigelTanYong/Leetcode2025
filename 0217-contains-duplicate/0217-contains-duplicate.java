// Time and Space Complexity: O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numFreqMap = new HashMap<>();
        
        for(int num : nums){
            if(numFreqMap.containsKey(num)){
                return true;
            }
            numFreqMap.put(num, 1);
        }
        return false;
    }
}