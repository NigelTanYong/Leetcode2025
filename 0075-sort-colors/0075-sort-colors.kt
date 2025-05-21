class Solution {
    fun sortColors(nums: IntArray): Unit {
        var t = 0
        var redCount = 0
        var whiteCount = 0
        var blueCount = 0

        for(i in nums.indices){
            if(nums[i] == 0){
                redCount++
            }
            else if(nums[i] == 1){
                whiteCount++
            }
            else{
                blueCount++
            }
        }
        while(redCount != 0){
            nums[t] = 0
            t++
            redCount--
        }
        while(whiteCount != 0){
            nums[t] = 1
            t++
            whiteCount--
        }
        while(blueCount != 0){
            nums[t] = 2
            t++
            blueCount--
        }
    }
}