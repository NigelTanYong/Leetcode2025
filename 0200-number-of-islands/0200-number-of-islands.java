// Time and Space Complexity: O(n*m)
class Solution {
    private int n, m;
    public int numIslands(char[][] grid) {
        int count = 0;
        n = grid.length;
        if(n == 0) return 0;
        m = grid[0].length;
        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                if(grid[i][j] == '1'){ //If the cell is land ('1'), we found a new island
                    DFS(grid, i,j); //mark whole island
                    ++count; // counts island
                }
            }
        }
        return count;
    }
    private void DFS(char[][] grid, int i, int j){
        // Base case: if out of bounds or at water ('0'), stop recursion
        if(i<0 || j<0||i>=n||j>=m||grid[i][j] != '1') return;
        grid[i][j] = '0';
        // Recursively visit all 4 adjacent directions (up, down, left, right)
        DFS(grid, i+1, j); //down
        DFS(grid, i-1, j); //up
        DFS(grid, i, j+1); //right
        DFS(grid, i,j-1); // left
    }
}