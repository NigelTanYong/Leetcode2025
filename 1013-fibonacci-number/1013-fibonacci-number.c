

int fib(int n){
     int a = 0, b = 1; //a = F(n-2), b = F(n-1)

    if(n<=1){ // for F(0) and F(1)
        return n;
    }
    for(int i = 2; i<= n; i++){
        int temp = a+b;
        a = b;
        b = temp;
    }
    return b;
}