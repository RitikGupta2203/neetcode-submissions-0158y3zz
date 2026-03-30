class Solution {
    public int trap(int[] height) {

        //Idea find the left most and right most value for each array element

        int n = height.length;
        int[] leftMax = getLeftMax(height, n);
        int[] rightMax = getRightMax(height, n);

        int finalSum = 0;

         //find the minimum for each element out of left and right and subtract the present height   
         for(int i = 0; i<n;i++ ){
            int h = Math.min(leftMax[i], rightMax[i]) - height[i];

            finalSum += h;
         }
         return finalSum;
    }


    int[] getLeftMax(int[] height, int n){
        int[] leftMax = new int[n];

        leftMax[0] = height[0];
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        return leftMax;
    }

    int[] getRightMax(int[] height, int n){
        int[] rightMax = new int[n];

        rightMax[n-1] = height[n-1];
        for(int i = n-2 ;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        return rightMax;
    }
}
