class MinStack {
     ArrayList<Integer> arr;
    public MinStack() {
        arr = new ArrayList<>();
    }
    
    public void push(int val) {
        arr.add(val);
    }
    
    public void pop() {
        if(!arr.isEmpty()){
            arr.remove(arr.size()-1);
        }
    }
    
    public int top() {
        if(!arr.isEmpty()){
             return arr.get(arr.size()-1);
        }
        return -1;
    }
    
    public int getMin() {
        if (arr.isEmpty()) return -1; // or throw
    int n = Integer.MAX_VALUE;

    for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i) < n) n = arr.get(i);
    }
    return n;
    }
}
