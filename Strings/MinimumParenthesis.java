import java.util.*;
public class MinimumParenthesis {
    public int solve(String A) {
        Stack<Character> stack = new Stack<Character>();
       int n = A.length();
       for(int i=0 ; i< n ;i++){
          
           switch( A.charAt(i)) {
               case '(': stack.push('(');
                           break;
               case ')': if(stack.size() > 0 && stack.peek() == '('){
                   stack.pop();
               } else stack.push(')');
               break;
           }
       }
      
       return stack.size();
   }
}
