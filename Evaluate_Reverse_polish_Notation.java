class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> st = new Stack<>();
      for(String ch : tokens ){
          
          if(ch .equals("+")){
            st.push(st.pop()+st.pop());
          }else if(ch .equals("-")){
            int x = st.pop();
            int y =st.pop();
            st.push(y-x);
          }else if(ch .equals("*")){
            st.push(st.pop()*st.pop());
          }else if(ch .equals("/")){
            int x = st.pop();
            int y = st.pop();
            st.push(y/x);
          }
           else {
                st.push(Integer.valueOf(ch));
          }
        
      }
      return st.pop();  
    }
}
