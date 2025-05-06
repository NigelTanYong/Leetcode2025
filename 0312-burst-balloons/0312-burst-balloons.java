class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];

        for (int g = 0; g < n; g++) { // g = gap
            for (int i = 0, j = g; j < n; i++, j++) {
                int max = Integer.MIN_VALUE;
                for (int k = i; k <= j; k++) {
                    int left = 0;
                    if (k != i) {
                        left = dp[i][k - 1];
                    }

                    int right = 0;
                    if (k != j) {
                        right = dp[k + 1][j];
                    }

                    int before = 1;
                    if (i > 0) {
                        before = nums[i - 1];
                    }

                    int after = 1;
                    if (j < n - 1) {
                        after = nums[j + 1];
                    }

                    int val = before * nums[k] * after;
                    int total = left + right + val;

                    if (total > max) {
                        max = total;
                    }
                }
                dp[i][j] = max;
            }
        }
        return dp[0][n - 1];

    }
}