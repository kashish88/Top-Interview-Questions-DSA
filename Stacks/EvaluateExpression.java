import java.util.*;
public class EvaluateExpression {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer>st=new Stack<>();
        for(String op:A){
            if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")){
                int n1=st.pop();
                int n2=st.pop();
                switch(op){
                    case "+":
                        int sum=n1+n2;
                        st.push(sum);
                        break;
                    case "-":
                        int diff=n2-n1;
                        st.push(diff);
                        break;
                     case "*":
                        int mul=n1*n2;
                        st.push(mul);
                        break;
                    case "/":
                        int div=n2/n1;
                        st.push(div);
                        break;
                }
            }else{
                st.push(Integer.parseInt(op));
            }
        }
        return st.pop();
    }
}
