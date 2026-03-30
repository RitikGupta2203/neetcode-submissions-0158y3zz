class Solution {
    //BRUTE FORCE
    // public int findMin(int[] nums) {
    //     //input : array: nums
    //     //output : int : return the minimum element  

    //     //plan:
    //     //we have to check the element that has smaller digit on left
    //     //smaller on right side.

    //     int minimumElement = Integer.MAX_VALUE;
    //     for(int i: nums){
    //         if(minimumElement> i) minimumElement = i;
    //     }     

    //     return minimumElement;  
    // }

    //Binary Search
    public int findMin(int[] arr) {
         int left = 0;
         int right = arr.length-1;
        
        int n = arr.length;
        if (arr[left]<=arr[right]) return arr[left];
         while (left<=right){
            
            int mid = left + (right - left)/2;
            int prev = (mid + n - 1) %n;
            int next = (mid + 1 )%n;

            if(arr[mid]< arr[prev] && arr[mid]< arr[next]){
                return arr[mid];
            }

            else if(arr[mid] < arr[right]){
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
         }   
    return -1;
    }
}
