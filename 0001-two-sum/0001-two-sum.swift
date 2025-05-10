class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var results = Array(repeating: 0, count: 2)
        for i in 0..<nums.count{
            for j in i+1..<nums.count{
                if(nums[j] == target - nums[i]){
                    results[0] = i
                    results[1] = j
                }
            }
        }
        return results
    }
}