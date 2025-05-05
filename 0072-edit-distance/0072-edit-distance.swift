class Solution {
    func minDistance(_ word1: String, _ word2: String) -> Int {
        let m = word1.count
        let n = word2.count
       
        let word1Arr = Array(word1)
        let word2Arr = Array (word2)
        var dp = Array(repeating: Array(repeating: 0, count: n+1), count: m+1)

        for i in 1..<m+1{
            dp[i][0] = i 
        }
        for j in 1..<n+1{
            dp[0][j] = j
        }
        for i in 1..<m+1{
            for j in 1..<n+1{
                if word1Arr[i-1] == word2Arr[j-1]{
                    dp[i][j] = dp[i-1][j-1]
                }
                else{
                    dp[i][j] = min(dp[i-1][j-1], min(dp[i-1][j], dp[i][j-1])) + 1
                }
            }
        }
        return dp[m][n]
    }
}