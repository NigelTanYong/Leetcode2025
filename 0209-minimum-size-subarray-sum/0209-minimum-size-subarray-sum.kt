class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var left = 0
        var curSum = 0
        var minLen = Int.MAX_VALUE

        for(right in nums.indices){
            curSum += nums[right];
            while (curSum >= target){
                minLen = minOf(minLen, right-left+1)
                curSum -= nums[left]
                left++
            }
        }
        return if (minLen == Int.MAX_VALUE) 0 else minLen
    }
}