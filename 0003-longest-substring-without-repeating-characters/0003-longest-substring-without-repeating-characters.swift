class Solution {
    func lengthOfLongestSubstring(_ s: String) -> Int {
        var left = 0
        var right = 0
        var maxLen = 0
        var count = s.count
        var map = [Int](repeating: 0, count: 128)
        let chars = Array(s)

        if s.count <= 0{return 0}

        while right<s.count{
            var rightChar = chars[right]
            map[Int(rightChar.asciiValue!)] += 1

            while map[Int(rightChar.asciiValue!)] > 1{
                var leftChar = chars[left]
                map[Int(leftChar.asciiValue!)] -= 1
                left += 1
            }
            maxLen =  max(maxLen, right - left + 1)  
            right += 1     
        }
        return maxLen
    }
}