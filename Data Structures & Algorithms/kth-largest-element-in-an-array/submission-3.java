class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length<k) return -1;
        Arrays.sort(nums);

        if (k > 0 && k <= nums.length) {
            return nums[nums.length - k]; 
        }
        return -1;
    }
}
