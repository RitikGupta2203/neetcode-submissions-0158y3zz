class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # given : nums array
        # ask: true if value occurs more than once:
        #else false:

        # 1. create set to check if value exist:

        #2. create a dict ={}

        dict = {}
        count = 0
        for i in nums:
            if i in dict.keys():
                return True
            
            dict[i] = count+1
        
        return False
