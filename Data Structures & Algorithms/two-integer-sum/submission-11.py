class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        container = {}


        for i,num in enumerate(nums):

            complement = target -num
            if complement in container:
                return [container[complement], i]

            container[num]= i
        return False

