class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        //sort by positions
        //check the time to reach the target and push to stack
        //check if the peek >= currentCarTime continue


        ///create a new 2D Array with for position and speed
        int n = position.length;

        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a,b) -> Integer.compare(a[0], b[0]));
        Stack<Double> st = new Stack<>();

        for(int i = position.length-1;i>=0;i--){
            double time = (double)(target-cars[i][0])/cars[i][1];
            
            if(!st.isEmpty() && st.peek()>=time){
               continue;
            }
            st.push(time);
        }

        return st.size();
    }
}
