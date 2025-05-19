class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var left = 0
        var right = 0 
        var maxLen = 0
        var count = s.length
        val map = IntArray(128)

        if (s.length<=0){
            return 0
        }

        while (right < s.length){
            val rightChar = s[right]
            map[rightChar.code] ++

            while(map[rightChar.code]>1){
                val leftChar = s[left]
                map[leftChar.code]--
                left++
            }
            maxLen = maxOf(maxLen, right-left+1)
            right++

        }
        return maxLen
    }
}