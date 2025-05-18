//time complexity O(n)
class Solution {
    fun minWindow(s: String, t: String): String {
        if (s.length < t.length) return ""

        val map = IntArray(128)
        var count = t.length
        var start = 0
        var end = 0
        var minStart = 0
        var minLen = Int.MAX_VALUE

        for (c in t){
            map[c.code]++ // code returns ascii value
        }

        //sliding process
        while (end< s.length){
            var currentChar = s[end]
            end++
            if(map[currentChar.code] > 0){
                count--
            }
            map[currentChar.code]--
            //a t included in window
            while(count == 0){
                //check if new window is the min Length
                if(end-start<minLen){
                    minStart = start
                    minLen = end-start
                }
                //move left
                currentChar = s[start]
                start++
                if(map[currentChar.code]==0){ //means the char being removed was exactly needed
                    count++
                }
                map[currentChar.code]++
            }
        }
        return if (minLen == Int.MAX_VALUE) "" else s.substring(minStart, minStart + minLen)
    }
}