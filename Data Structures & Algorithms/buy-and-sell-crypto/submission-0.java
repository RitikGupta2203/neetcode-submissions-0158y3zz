class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for(int i : prices){
            if(i < buy) buy = i;
            if(i - buy > profit) profit =i-buy; 
        }

        return profit;
    }
}
