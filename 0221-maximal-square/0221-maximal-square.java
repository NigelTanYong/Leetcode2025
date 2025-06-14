//dynamic programming approach
//Time and space complexity = O(nm)
class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0; //matrix empty or no rows or no columns

        int max = 0, rowsNum = matrix.length,colsNum = matrix[0].length;
        int[][] dp = new int[rowsNum+1][colsNum+1]; //to store length of the largest square (made of 1s) whose bottom-right corner is at matrix[i-1][j-1]

        //for every cell i,j
        for(int i = 1; i<=rowsNum; i++){
            for(int j = 1; j<=colsNum; j++){
                /*because you can only grow a square if all three directions can support a larger square */
                if(matrix[i-1][j-1] == '1'){ //bottom right
                    dp[i][j] = 
                    Math.min(dp[i-1][j-1], //top-left
                    Math.min(dp[i-1][j], //top
                    dp[i][j-1])) // left
                    + 1;
                    max = Math.max(max,dp[i][j]); //tracks largest side length of square for each iteration
                }
            }
        }
        return max*max;
    }
}