public class NearestSmallerElement {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> retval=new ArrayList<>();
         Stack<Integer> st=new Stack<Integer>();
         
         for(int i=0;i<A.size();++i){
             while(!st.isEmpty() && A.get(i)<=st.peek()){
                 st.pop();
             }
             if(st.isEmpty()){
                 retval.add(-1);
             }
             else{
                 retval.add(st.peek());
             }
             st.add(A.get(i));
         }
         
         return retval;
     }
}
