class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int MaxArea = Integer.MIN_VALUE;

        while(left< right){
            int currArea = 0;
            int minimumHeight = Math.min(heights[left], heights[right]);

            currArea = minimumHeight * (right-left);

            if(heights[right]> heights[left]) left++;
            else right--;

            MaxArea = Math.max(currArea, MaxArea);
        }
        return MaxArea;
    }
}
