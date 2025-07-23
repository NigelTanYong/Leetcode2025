//time complexity and space complexity: o(1)
class Solution {
    public int countOdds(int low, int high) {
        int nums = high-low +1; // total no in range
        if(low%2!=0 && high%2!=0)
            return nums/2 + 1;
        else
            return nums/2;
    }
}