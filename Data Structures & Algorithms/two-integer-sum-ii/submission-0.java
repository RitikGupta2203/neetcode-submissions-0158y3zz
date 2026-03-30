class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force

        for(int i = 0 ;i<nums.length-1;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[i]+ nums[j]== target) return new int[]{i+1,j+1};
            }

        }
        return new int[]{0,0};
    }
}
