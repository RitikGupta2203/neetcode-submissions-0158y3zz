class Solution {
    public int findMin(int[] nums) {
        //input : array: nums
        //output : int : return the minimum element  

        //plan:
        //we have to check the element that has smaller digit on left
        //smaller on right side.

        int minimumElement = Integer.MAX_VALUE;
        for(int i: nums){
            if(minimumElement> i) minimumElement = i;
        }     

        return minimumElement;  
    }
}
