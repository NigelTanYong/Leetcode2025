class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for(i in nums.indices){
            val value = target-nums[i]
            if(map.containsKey(value)){
                val result = IntArray(2)
                result[0] = map[value]!!
                result[1] = i
                return result
            }
            map[nums[i]] = i  
        }
        return IntArray(0)
    }
}