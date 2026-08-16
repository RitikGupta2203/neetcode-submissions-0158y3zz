class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # given : nums array
        # ask: true if value occurs more than once:
        #else false:

        # set = check:

        res = set()

        for i in nums:
            if i in res:
                return True
            
            res.add(i)
        
        return False