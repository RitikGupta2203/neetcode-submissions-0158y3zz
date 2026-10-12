from collections import Counter
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        #1.count the frequency
        freq = Counter(nums)

        #2. create a heap to have K elements with most frequency(min heap) 
        heap =[]
        for num,freq in freq.items():
            heapq.heappush(heap, (freq, num))

            if len(heap)>k:
                heapq.heappop(heap)

        # return num from heap
        return [num for freq, num in heap]

        