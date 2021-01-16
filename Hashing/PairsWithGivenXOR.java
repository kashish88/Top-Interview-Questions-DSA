import java.util.*;
public class PairsWithGivenXOR {
    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer>s=new  HashSet();
        for(int i=0;i<A.size();i++){
            s.add(A.get(i));
        }
        int count=0;
        for(int i=0;i<A.size();i++){
            int x=A.get(i)^B;
            if(s.contains(x)){
            count++;
            s.remove(A.get(i));
            }
        }
        return count;
    }
}
