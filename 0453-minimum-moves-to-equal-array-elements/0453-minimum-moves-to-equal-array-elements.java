//reversing the move logic (math reduction approach)
// Time complexity: O(n), Spacae Complexity: O(1)
class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE, moves = 0;
        
        for(int num : nums){
            if(num<min) 
                min = num; // get min number
        }
        for(int num: nums){
            moves += num - min;
        }
        return moves;
    }
}