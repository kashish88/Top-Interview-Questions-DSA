import java.util.*;

public class FirstMissingInteger {
    public int firstMissingPositive(ArrayList<Integer> A) {
        for(int i=0;i<A.size();i++){
            int n=A.get(i);
            int pos=n-1;
            if(pos>=0 && pos<A.size() && A.get(pos)!=n){
                A.set(i,A.get(pos));
                A.set(pos,n);
                i--;
            }
        }
        for(int i=0;i<A.size();i++){
            if(A.get(i)!=i+1)
            return i+1;
        }
        return A.size()+1;
   }
}
