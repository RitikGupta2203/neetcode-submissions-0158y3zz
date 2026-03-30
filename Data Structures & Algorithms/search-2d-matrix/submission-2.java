class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         //binary search

        int m = matrix.length;  //row
        int n = matrix[0].length; //col

        int start = 0; 
        int end = m * n -1; 

        while(start<=end){
            int mid = start + (end-start)/2;

            int row = mid/n;     //mapped 1dArray equivalent of 2d Array 
            int col = mid%n;     //mapped 1dArrau equivalent for 2dArray

            if(matrix[row][col] < target) start = mid+1;
            else if(matrix[row][col] > target) end = mid-1;
            else return true;
        }

        return false;
    }
}
