//Time complexity: O(logn)
//space: O(1)
class Solution {
    public int reverse(int x) {
        int result = 0;

        while(x!=0){
            if((result < Integer.MIN_VALUE/10) || (result > Integer.MAX_VALUE/10)) return 0; // /10 becuase of the *10 in result
            int remainder =  x%10;
            result = result * 10 + remainder; // mutiply 10 for each digit
            x/=10;
        }
        return result;
    }
}