//Time complexity: O(logn)
//Space complexity: O(1)
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;

        while(n % 3 == 0){ // 3 * 3 * 3 ...* 3 --> x times
            n = n/3;
        }
        if (n==1) return true; //becuz finally n/3 must be 1 as it is the last divisible by 3
        return false;
    }
}