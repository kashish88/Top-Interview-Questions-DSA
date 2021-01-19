import java.util.*;
public class SimplifyDirectoryPath {
    public String simplifyPath(String A) {
      
        Stack<String>st=new Stack<String>();
        String []args=A.trim.split("/");
        for(String s:args){
            if(s.equals("..")){
            if(!st.isEmpty()){
                st.pop();
            }
        }
        else if(!s.isEmpty() && !s.equals(".")){
            st.push(s);
        }
        }
     
        StringBuilder sb=new StringBuilder("");
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
            sb.insert(0, "/");
        }
        return sb.length()!=0?sb.toString():"/";
    }
}
