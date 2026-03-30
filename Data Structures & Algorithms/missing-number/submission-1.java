class Solution {
    public int missingNumber(int[] nums) {
        int missingNumber =0;
        
        for(int i : nums){
            missingNumber ^= i;
        }

        for(int i =0; i<=nums.length;i++){
            missingNumber ^=i;
        }

        return missingNumber;
    }
}
