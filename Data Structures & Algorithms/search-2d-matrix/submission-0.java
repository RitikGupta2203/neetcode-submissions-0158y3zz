class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //start with i = 0  and j = n-1;
        //check if the value is > target j--;
        //else i++
       int rows = matrix.length;
       int col   = matrix[0].length;
        
        int i =0, j= col-1;
        while(i<rows && j>=0){
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}
