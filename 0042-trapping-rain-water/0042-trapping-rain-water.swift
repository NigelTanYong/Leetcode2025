class Solution {
    func trap(_ height: [Int]) -> Int {
        var left = 0, leftMax = 0, rightMax = 0, totalWaterCollected = 0
        var right = height.count - 1

        while left<right{
            if height[left] < height[right]{
                if height[left] >= leftMax{
                    leftMax = height[left]
                }
                else{
                    totalWaterCollected += leftMax - height[left]
                }
                left+=1
            }
            else{
                if height[right]>=rightMax{
                    rightMax = height[right]
                }
                else{
                    totalWaterCollected += rightMax - height[right]
                }
                right -= 1
            }
        }

        return totalWaterCollected
    }
}