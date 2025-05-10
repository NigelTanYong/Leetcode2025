class Solution {
    func maxCoins(_ nums: [Int]) -> Int {
        let n = nums.count
        let arr = [1] + nums + [1]  // Padding with 1s
        let size = arr.count
        // Initialize 2D dp array with zeros
        var dp = Array(repeating: Array(repeating: 0, count: size), count: size)
        
        for length in 2..<arr.count{
            for left in 0..<(size-length){
                let right = left + length
                for i in (left+1)..<right{
                    let coins = arr[left] * arr[i] * arr[right]
                    let total = dp[left][i] + coins + dp[i][right]
                    dp[left][right] = max(dp[left][right], total)
                }
            }
        }
        return dp[0][n+1]
    }
}