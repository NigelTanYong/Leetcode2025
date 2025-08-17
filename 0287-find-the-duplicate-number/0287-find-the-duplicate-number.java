//Fast-Slow Pointer
//Time Complexity: O(n), Space complexity: O(1)
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        //Check for cycle (1st time repeated number)
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow!=fast);
        slow = 0;
        //Hare Traverse in a cycle till meet tortoise 
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
