// Greedy/Dynamic Programming hybrid (state machine DP)
// Time Complexity: O(n), Space Complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
        int sell1 = 0, sell2 = 0;

        for(int price:prices){//update greedily and dp builds optimal solution overtime
            buy1 = Math.max(buy1, -price); // negative price cuz when you buy a stock you loss money first
            sell1 = Math.max(sell1, buy1 + price); //keep or sell
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }
        return sell2;
    }
}