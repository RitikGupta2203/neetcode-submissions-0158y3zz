class Solution {
    public int findDuplicate(int[] nums) {
         //slow pointer fast pointer Approach:
        //detect the cycle
        //restart the slow pointer from start and 
        //fast pointer from the meeting point(both one step) 
        //the point where they meet is the answer. 


        int slow = nums[0];
        int fast = nums[0];

        slow = nums[slow];
        fast = nums[nums[fast]];

        //detect cycle
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = nums[0];

        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
