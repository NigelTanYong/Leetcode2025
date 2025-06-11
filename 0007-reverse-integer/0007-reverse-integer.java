//Time complexity: O(logn)
//space: O(1)
class Solution {
    public int reverse(int x) {
        int result = 0;
        while(x != 0){//overflow check; /10 is to compensate the *10 later
            if(result > Integer.MAX_VALUE/10) return 0;
            if(result < Integer.MIN_VALUE/10) return 0;

            int remainder = x%10;
            result = result * 10 + remainder; // result * 10 is to multiply the previous iteration remainder
            x = x/10;
        }
        return result;
    }
}