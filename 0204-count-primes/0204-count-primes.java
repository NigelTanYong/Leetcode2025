/*Example:
Primes < 10: 2, 3, 5, 7
Not primes: 4 (2×2), 6 (2×3), 8 (2×4), 9 (3×3)*/
//time complexity O(n + nlog(logn))
//space complexity O(n) -- boolean array with size n
class Solution {
    public int countPrimes(int n) {
        int result=0;
        //deal with non prime no. below 2
        if(n<2) return 0;

        boolean isPrime[] = new boolean[n]; // n+1 cuz need to consider 0
        Arrays.fill(isPrime, true);
        // Sieve of Eratosthenes
        for(int i=2;i*i<=n;i++)
        {
            if(isPrime[i])
            {
                for(int j=i*i;j<n;j+=i) // Mark all multiples of i as non-prime

                {
                    isPrime[j]=false;
                }
            }
        }
        
        for(int i=2;i<n;i++)
        {
            if(isPrime[i]) result++;
        }
        return result;
    }
}