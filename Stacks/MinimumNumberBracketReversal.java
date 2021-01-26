import java.util.*;
public class  MinimumNumberBracketReversal{
    public static void main(String[] args)  
    { 
        String expr = "}}{{"; 
          
        System.out.println(countMinReversals(expr)); 
    } 
    static int countMinReversals(String expr) {
      
        int len=expr.length();
        if(len%2!=0){
            return -1;
        }

        Stack<Character> s=new Stack<>();
        for(int i=0;i<len;i++){
            char c=expr.charAt(i);
            if(c=='}' &&!s.empty()){
                if (s.peek()=='{') 
                    s.pop(); 
                    else
                    s.push(c);
            }
            else
                s.push(c); 
        }
        // red_len = (m+n) 
        int red_len = s.size(); 
        int n=0;
        while(!s.empty() && s.peek()=='{'){
            s.pop();
            n++;
        }
// return ceil(m/2) + ceil(n/2) which is 
        // actually equal to (m+n)/2 + n%2 when 
        // m+n is even. 
        return (red_len/2 + n%2);
    }
}