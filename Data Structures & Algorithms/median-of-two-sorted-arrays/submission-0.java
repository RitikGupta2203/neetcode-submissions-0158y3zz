class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        //brute force  : 2 pointer 
        int n = nums1.length;
        int m = nums2.length;

        int i = 0 , j=0, k= 0;

        int idx1 = (n+m)/2;
        int element1 = -1;

        int idx2 = (n+m)/2 - 1 ;
        int element2 = -1;


        while(i< n && j<m){
            
            if(nums1[i] <= nums2[j]){
                if(k == idx1){
                    element1 = nums1[i];
                }
                if(k == idx2){
                    element2 = nums1[i];
                }
                i++;
                k++;
            }

            else{
                if(nums1[i] > nums2[j]){
                if(k == idx1){
                    element1 = nums2[j];
                }
                if(k == idx2){
                    element2 = nums2[j];
                }
                j++;
                k++;
                }
            }
        }


        while(i<n){
            if(k == idx1){
                    element1 = nums1[i];
                }
                if(k == idx2){
                    element2 = nums1[i];
                }
                i++;
                k++;
        }

        while(j<m){
                if(k == idx1){
                    element1 = nums2[j];
                }
                if(k == idx2){
                    element2 = nums2[j];
                }
                j++;
                k++;
        }

        if((n+m) % 2 == 1) return element1;
        else return (element1 +  element2 ) / 2.0; 
    }
}