class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Optmised O(nlogn) : binary search 

        for(int i = 0;i< nums.length;i++){
            int complement = target- nums[i];
            int ans =  BinarySearch(nums, i+1, nums.length-1, complement);

            if (ans != -1) {
             return new int[] { i + 1, ans + 1 };
             
            }
           
        }
         return new int[] { -1,-1};
    }

        int BinarySearch(int[] nums, int low, int high, int complement){

                while(low<=high){
                    int mid = low+(high-low)/2;
                    if(nums[mid] == complement){
                        return mid;
                    }
                    else if(nums[mid]> complement) high = mid-1;
                    else low = mid+1;
                }
                return -1;
        }
        
}
