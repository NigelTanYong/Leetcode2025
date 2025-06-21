//max profit means you earn everytime stocks drop lesser than the one you buy and add together
//Time complexity: O(n), Space complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int profit = 0;
        
        for(int i = 1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}