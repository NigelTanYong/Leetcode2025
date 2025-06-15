//two pointer approach
//Time complexity: O(n), Space complexirt: O(1)
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left =0, right = height.length-1;

        while(left<right){
            int curArea = (right-left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, curArea);
            if(height[left]<height[right]){ //left shorter, then travrse to find taller
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}