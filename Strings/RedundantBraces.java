import java.util.*;
public class RedundantBraces {
    public int braces(String A) {
        Stack<Character> stack = new Stack<Character>();
	    boolean lastPopped = false;
	    for(int i = 0; i < A.length(); i++) {
	        if(A.charAt(i) == '(' || A.charAt(i) == '+' || A.charAt(i) == '-' || A.charAt(i) == '*' || A.charAt(i) == '/') {
	            stack.push(A.charAt(i));
	        } else if (A.charAt(i) == ')') {
	            boolean didPopSymbol = false;
	            while(stack.peek() != '(') {
	                didPopSymbol = true;
	                stack.pop();	           
	            }
	            if(!didPopSymbol) return 1;
	            stack.pop();
	        }
	    }
	    return 0;
    }
}
