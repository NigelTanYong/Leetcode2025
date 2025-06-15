//similar to itreative fibonacci approach DP
//ways(n) = ways(n - 1) + ways(n - 2)
//Time Complexity: O(n), Space Complexity: O(1)
class Solution {
    public int climbStairs(int n) {
        if(n ==1){ // only one way if n=1
            return 1;
        }
        int a = 1, b = 2; // base e.g.  ways(n-2), ways(n-1)

        for(int i = 3; i<=n; i++){ // for n=3 onwards
            int temp = a+b;
            a = b;
            b = temp;
        }

        return b;

    }
}