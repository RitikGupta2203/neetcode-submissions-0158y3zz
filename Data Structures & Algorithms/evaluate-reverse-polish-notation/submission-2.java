class Solution {
    public int evalRPN(String[] token) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ;i < token.length;i++){
            if(!(token[i].equals("+") || token[i].equals("-") || token[i].equals("*") || token[i].equals("/") )){
                st.push(Integer.parseInt(token[i]));
            }
            else{
                int a  = st.pop();
                int b  = st.pop();

                if(token[i].equals("+")) st.push(a+b);
                else if(token[i].equals("-")) st.push(b-a);
                else if(token[i].equals("*")) st.push(a*b);
                else if(token[i].equals("/")) st.push(b/a);
            }
        }

        return st.peek();
    }
}
