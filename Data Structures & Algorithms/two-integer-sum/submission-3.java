class Solution {
    public int[] twoSum(int[] nums, int target) {
    //   //Fails at the -ve value because the array is not sorted    
    //    int i =0;
    //    int j=nums.length-1;
    //    int[] arr = new int[2];
    //    while(i<j){
    //     if(nums[i] + nums[j]==target){
    //         arr[0] = i;
    //         arr[1] = j;

    //     return arr;
    //     }
    //     else if(nums[i] + nums[j]< target)
    //     i++;
    //     else
    //     j--;
    //    }
       
    // //return new int[]{};


    //Hashmap Based approach
    HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int complement = target - nums[i];

            if(hashmap.containsKey(complement)){
                return new int[]{hashmap.get(complement), i};
            }
            hashmap.put(nums[i], i);
            
        }
        return new int[]{};
    }
}
