class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:

        i,j=0,0
        ans = []
        
        while j<len(nums):
            
            if j-i+1<k:
               j+=1
            
            elif j-i+1==k:
                mx = ans.append(max(nums[i:j+1]))
                i+=1
                j+=1
        return ans
        