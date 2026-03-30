class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hMap= new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        //count : element / freq
        for(int i : nums){
            hMap.put(i, hMap.getOrDefault(i,0)+1 );
        }

        
        for(Map.Entry<Integer,Integer> hs : hMap.entrySet()){
                minHeap.add(hs);
                if(minHeap.size()>k) minHeap.poll();
        }

        int[] arr = new int[k];
        int index = 0;
        while(!minHeap.isEmpty()){
            Map.Entry<Integer, Integer> map = minHeap.poll();
            int key = map.getKey();
            int value = map.getValue();
            arr[index++] = key;
        }
        return arr;
    }
}
