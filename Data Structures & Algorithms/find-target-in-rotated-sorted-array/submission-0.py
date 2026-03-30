class Solution:
    def search(self, nums: List[int], target: int) -> int:
        # input: List: nums , int : target
        #output: int:  index of target or -1

        # brute force 
        for index, value in enumerate(nums):
            if value == target:
                return index

        return -1