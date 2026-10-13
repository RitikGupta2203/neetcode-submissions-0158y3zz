class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        #count the frequency
        freq = Counter(nums)

        #use heap to get min element
        heap = []
        for index, num in freq.items():
            heapq.heappush(heap, (num, index))

            if len(heap)> k:
                heapq.heappop(heap)
        
        return [num for index,num in heap]
