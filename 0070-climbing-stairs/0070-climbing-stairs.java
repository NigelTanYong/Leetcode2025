//similar to itreative fibonacci approach
//ways(n) = ways(n - 1) + ways(n - 2)
//Time Complexity: O(n), Space Complexity: O(1)
class Solution {
    public int climbStairs(int n) {
        if(n ==1){ // only one way if n=1
            return 1;
        }
        int a = 1, b = 2; // base case where n=2

        for(int i = 3; i<=n; i++){ // for n=3 onwards
            int temp = a+b;
            a = b;
            b = temp;
        }

        return b;

    }
}