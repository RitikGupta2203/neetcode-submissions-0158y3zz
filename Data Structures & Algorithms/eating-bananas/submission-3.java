class Solution {
    // input: array: number of bananas 
        //  h: number of hours 
        // output: int : k hours it takes to eat all

        //contstraints: k< h
        //2. if he eats from a pile where pile has less than k bananas
        // he doesn't eat in that hour after finishing

        //Plan:
        /*
        1.apply a binary search with the range minimum koko can eat : 1 -> 11: maximum koko can eat in hour
        2. if the mid is satisfying the total hours update the right to mid to find minimum time.
        else update the left to mid+1;
        */
    public int maxElement(int[] piles){
        int maxEle = 0;
        for(int i: piles){
            if(maxEle< i) maxEle =i;
        }
        return maxEle;
    }

    public int totalHours(int[] piles, int mid){
        int totalH = 0;

        for(int val : piles){
            totalH += Math.ceil((double)val/mid); //(val + mid - 1) / mid  ==  ceil(val / mid)
        }
        return totalH;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = maxElement(piles);

        while(left<right){
            int mid = left+ (right-left)/2;
            int totalHours = totalHours(piles, mid); 

            if(totalHours<=h) right = mid;
            else left = mid+1;
        }
        return left;
    }
}
