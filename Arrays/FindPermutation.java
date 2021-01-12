import java.util.*;

public class FindPermutation {
    public ArrayList<Integer> findPerm(final String A, int B) {
        int sm=1;
        int lg=B;
        ArrayList<Integer>op=new ArrayList<Integer>();
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='D'){
                op.add(lg);
                lg=lg-1;
            }else{
                    op.add(sm);
                sm=sm+1;
            }
        }
               op.add(sm);
               return op;
    }
}
