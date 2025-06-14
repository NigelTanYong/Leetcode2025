// Time and Space Complexity: O(n)
class Solution {
    public int longestConsecutive(int[] nums) {
        int longestStreak = 0;

        if(nums.length ==0) return 0; //cases when nums array is empty
        
        HashSet<Integer> set = new HashSet<>(); //unique but unordered
        for(int num : nums){
            set.add(num);
        }

        for(int num: set){
            if(!set.contains(num - 1)){ //start of set
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)){ //loop when set contain current number and continue increment
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;

    }
}