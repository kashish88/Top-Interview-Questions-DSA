import java.util.*;
public class RomanToInteger {
    private static final Map<Character,Integer>ct=new HashMap<>();
    static {
        ct.push('I',1);
        ct.push('V',5);
        ct.push('X',10);
        ct.push('L',50);
        ct.push('C',100);
        ct.push('D',500);
        ct.push('M',1000);
        
    }
    public int romanToInt(String A) {
        Stack<Integer> stack = new Stack<>();
       
       int length = A.length();
       for(int i = 0; i < length; i++) {
           int value = ct.get(A.charAt(i));
           
           if(!stack.isEmpty() && stack.peek() < value) {
               int prev = stack.pop();
               stack.push(value - prev);
           } else {
               stack.push(value);
           }
       }
       
       int result = 0;
       while(!stack.isEmpty()) {
           result += stack.pop();
       }
       return result;
   }
}
