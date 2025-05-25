class Solution {
    fun fib(n: Int): Int {
        var a = 0;
        var b = 1;
        if(n<=1){
            return n
        }
        for (i in 2..n){
            var temp = b + a
            a = b
            b = temp
        }
        return b
    }
}