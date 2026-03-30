class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = prices[0]
        profit =0
        print("intial buy is : " , buy)
        for i in prices:
            if buy > i:
                buy = i
                print("current buy is :", buy)
            if i- buy > profit:
                profit = i-buy
                print("profit is : " , profit)
        return profit