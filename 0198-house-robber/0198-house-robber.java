// space-optimized Dynamic Programming (DP) 
//Time Complexity: O(n), Space Complexity: O(1)
class Solution {
    public int rob(int[] nums) {
        int prevRob = 0;
        int maxRob = 0;

        for(int num: nums){
            int temp = Math.max(maxRob, prevRob+num); //either you skip or rob
            prevRob = maxRob;
            maxRob = temp;
        }
        return maxRob;
    }
}