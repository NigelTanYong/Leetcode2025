class Solution {
    func sortColors(_ nums: inout [Int]) {
        var t = 0
        var redCount = 0
        var whiteCount = 0
        var blueCount = 0

        for i in 0..<nums.count {
            if nums[i] == 0 {
                redCount += 1
            }
            else if nums[i] == 1 {
                whiteCount += 1
            }
            else {
                blueCount += 1
            }
        }

        while redCount != 0 {
            nums[t] = 0
            t += 1
            redCount -= 1
        }
        while whiteCount != 0 {
            nums[t] = 1
            t += 1
            whiteCount -= 1
        }

        while blueCount != 0 {
            nums[t] = 2
            t += 1
            blueCount -= 1
        }
    }
}