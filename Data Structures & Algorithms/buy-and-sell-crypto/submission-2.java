class Solution {
    public int maxProfit(int[] prices) {
        int length  = prices.length;

        int profit = 0;
        for(int i = 0;i < length;i++){
            for(int j = i+1 ; j< length; j++){
                profit = Math.max(prices[j] - prices[i], profit);
            }
        }
        return profit;
    }
}
