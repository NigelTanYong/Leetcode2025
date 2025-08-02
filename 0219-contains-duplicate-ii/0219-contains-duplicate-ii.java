class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //qn says if there are two distinct indices - means once this condition is met, we can return
        //use set to store window of num
        //loop
        ////if num already contained in set, then true
        ////add num to set 
        ////check if size of window is maintained - more than k need to shift the windows
        Set<Integer> window = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(window.contains(nums[i])) return true;
            window.add(nums[i]);
            if(window.size()>k){ // maintiaing window
                window.remove(nums[i-k]); //by removing left most element
            }
        }
        return false;
    }
}