//Kadane's Algo
//time complexity: O(n), Space complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for(int i = 1; i< prices.length; i++){
            if(prices[i]<buy){ //when today price lower than previous day
                buy = prices[i];
            }
            else if(prices[i] - buy > profit){ //for the last day in the array
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}