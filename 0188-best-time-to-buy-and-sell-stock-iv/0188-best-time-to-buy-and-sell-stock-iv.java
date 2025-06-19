// Greedy + State Compression Dynamic Programming (state tracking dp)
//Time Complexity: O(k*n), Space Complexity: O(k)
class Solution {
    public int maxProfit(int k, int[] prices) {
        int[] buyPrice = new int[k];
        int[] profit = new int[k];
        
        Arrays.fill(profit, Integer.MIN_VALUE);
        Arrays.fill(buyPrice, Integer.MAX_VALUE);

        for(int price : prices){
            for( int i = 0; i < k; i++){
                int prevProfit = 0;
                if(i>0){
                    prevProfit = profit[i-1];
                }
                buyPrice[i] = Math.min(buyPrice[i], price - prevProfit);
                profit[i] = Math.max(profit[i], price - buyPrice[i]);
            }
        }
        return profit[k-1];

        //set to 
    }
}