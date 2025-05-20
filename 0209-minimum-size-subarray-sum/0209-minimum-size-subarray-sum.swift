class Solution {
    func minSubArrayLen(_ target: Int, _ nums: [Int]) -> Int {
        var left = 0
        var curSum = 0
        var minLen = Int.max

        for right in 0..<nums.count {
            curSum += nums[right]

            while curSum >= target {
                minLen = min(minLen, right-left+1)
                curSum-=nums[left]
                left += 1
            }
        }
        return minLen == Int.max ? 0 : minLen  
    }
}