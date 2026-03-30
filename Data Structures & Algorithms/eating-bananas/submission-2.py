class Solution:
    def CalculateTotalHours(self, piles, mid):
        totalHours = 0
        for val in piles:
            totalHours += math.ceil(val/mid)
        
        return totalHours


    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        left = 1
        right = max(piles)

        while left<right:
            mid = left+(right-left) // 2
            totalHours = self.CalculateTotalHours(piles, mid)

            if totalHours <= h:
                right = mid
            else:
                left = mid+1
        return left