import java.util.*;

public class BalancedParenthesis {
    public int solve(String A) {
        Stack <Character> st=new Stack<>();
       st.push(A.charAt(0));
       for(int i=1;i<A.length();i++){
           if(A.charAt(i)==')' && st.empty()==false && st.peek()=='('){
               st.pop();
             }else{
                 st.push(A.charAt(i));
             }
           }
           if(st.empty())
           return 1;
           
       return 0;
   }
}
