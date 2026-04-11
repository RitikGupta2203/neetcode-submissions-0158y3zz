class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        dict = {}
        count = 0
        for i in nums:
            if i in dict.keys():
                return True
            dict[i]=count+1
        return False