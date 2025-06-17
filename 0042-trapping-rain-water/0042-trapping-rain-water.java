//two-pointer approach
//time complexity: O(n), space complexity: O(1)
class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int maxLeft = 0, maxRight = 0;
        int totalTrapped = 0;

        while (left < right){
            if(height[left] < height[right]){ // process left side
                if(height[left] >= maxLeft){
                    maxLeft = height[left];
                }
                else{
                    totalTrapped += maxLeft - height[left];
                }
                left++;
            }
            else{ //height[left] > height[right] // process right side
                if(height[right] >= maxRight){
                    maxRight = height[right];
                }
                else{
                    totalTrapped += maxRight -height[right];
                }
                right--;
            }
        }
        return totalTrapped;
    }
}
