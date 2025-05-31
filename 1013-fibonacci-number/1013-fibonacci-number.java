// O(n)
class Solution {
    public int fib(int n) {
        int a = 0; // f(n-2)
        int b = 1; // f(n-1)
        if(n<=1){
            return n;
        }

        for(int i = 2; i<=n; i++){
            int temp = a+b;
            a = b;
            b = temp;

        }
        return b;
    }
}