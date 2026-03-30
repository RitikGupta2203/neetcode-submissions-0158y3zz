class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //normal Approach O(n^2)
        Arrays.sort(nums);
        HashSet<List<Integer>> hs = new HashSet<>();


        for(int i = 0 ; i < nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    hs.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(sum>0) k--;
                else j++;
            }
            
           
        }
        return new ArrayList<>(hs);
    }
}
