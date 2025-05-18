class Solution {
    func minWindow(_ s: String, _ t: String) -> String {
       if s.count < t.count { return "" }

        var map = [Int](repeating: 0, count: 128)
        for c in t {
            map[Int(c.asciiValue!)] += 1
        }

        var count = t.count
        var start = s.startIndex
        var end = s.startIndex
        var minLen = Int.max
        var minStart = s.startIndex

        while end < s.endIndex {
            let current = s[end]
            let ascii = Int(current.asciiValue!)
            if map[ascii] > 0 {
                count -= 1
            }
            map[ascii] -= 1
            end = s.index(after: end)

            while count == 0 {
                let windowLen = s.distance(from: start, to: end)
                if windowLen < minLen {
                    minStart = start
                    minLen = windowLen
                }

                let left = s[start]
                let leftAscii = Int(left.asciiValue!)
                map[leftAscii] += 1
                if map[leftAscii] > 0 {
                    count += 1
                }
                start = s.index(after: start)
            }
        }

        return minLen == Int.max ? "" : String(s[minStart..<s.index(minStart, offsetBy: minLen)])
    }
}