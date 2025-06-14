//two-pointer approach
//time complexity: O(n), space complexity: O(1)
class Solution {
    public int trap(int[] height) {
        int right = height.length -1;
        int left =0, maxLeft = 0, maxRight =0, totalWaterCollected = 0;

        while(left<right){
            if(height[left] < height[right]){ //process left side
                if(height[left] >= maxLeft){ // if current height is higher than previous height
                    maxLeft = height[left];//set as maxLeft
                }
                else{
                    totalWaterCollected += maxLeft - height[left];
                }  
                left++;
            }
            else{ //process right side
                if(height[right] >= maxRight){
                    maxRight = height[right];
                }
                else{
                    totalWaterCollected += maxRight - height[right];
                }
                right--;
            }
        }
        return totalWaterCollected;
    }
}
