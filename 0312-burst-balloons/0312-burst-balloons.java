class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        
        // Add padding
        int[] arr = new int[n + 2];
        arr[0] = 1;
        arr[n + 1] = 1;
        for (int i = 0; i < n; i++) {
            arr[i + 1] = nums[i];
        }

        int[][] dp = new int[n + 2][n + 2];

        // length is the size of the range (not actual length of the subarray)
        for (int length = 2; length < arr.length; length++) {
            for (int left = 0; left < arr.length - length; left++) {
                int right = left + length;
                for (int i = left + 1; i < right; i++) {
                    int coins = arr[left] * arr[i] * arr[right];
                    int total = dp[left][i] + coins + dp[i][right];
                    dp[left][right] = Math.max(dp[left][right], total);
                }
            }
        }

        return dp[0][n + 1]; // whole range (excluding virtual balloons)

    }
}