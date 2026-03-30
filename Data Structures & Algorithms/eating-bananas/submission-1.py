class Solution:
    def totalHours(self, piles, mid):
        totalHours = 0
        for val in piles:
            totalHours += (val + mid-1)//mid
        return totalHours

    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        left = 1
        right = max(piles)
        
        while left<right:
            mid = left + (right-left)//2
            totalHours = self.totalHours(piles, mid)

            if totalHours<=h:
                right = mid
            else:
                left = mid+1
        
        return left