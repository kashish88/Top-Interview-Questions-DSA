import java.util.*;
public class SmallerOrEqualElements {
    public int solve(ArrayList<Integer> A, int B) {
        int i=0,j=A.size()-1;
        for(;i<=j;){
            int m=(i+j)/2;
            if(A.get(m)<=B){
                i=m+1;
            }else{
                j=m-1;
            }
        }
        return j+1;
    }
}
