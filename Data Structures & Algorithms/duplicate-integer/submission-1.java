class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            System.out.println("value:" + nums[i]);
               if (nums[i] == nums[i + 1]) { 
        System.out.println("Value at i: " + nums[i]);
        System.out.println("Value at i+1: " + nums[i + 1]);
        return true; 
    }
        }
        return false;
    }
}
