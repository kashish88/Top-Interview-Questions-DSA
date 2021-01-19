import java.util.*;
public class FirstNonRepeatingCharacter{
    public String solve(String A) {
     
        Queue<Character>queue=new LinkedList<>();
        StringBuilder buffer=new  StringBuilder();
        int []map=new int[26];
        for(int i=0;i<A.length();i++){
            char c=A.charAt(i);
            map[c-'a']+=1;
            char b='#';
            while(!queue.isEmpty()){
                if(map[queue.peek()-'a']==1){
                    b=queue.peek();
                    break;
                }else{
                    queue.poll();
                }
            }
            buffer.append(b);
        }
      
        return buffer.toString();
    }
}