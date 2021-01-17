import java.util.*;
public class MaximumOnesAfterModification {
    public int solve(ArrayList<Integer> A, int B) {
      int n=A.size();
      int maxlen=0;
      int i=0,j=0;
      for( i=0;i<n;i++){
          if(A.get(i)==0)
            B--;
            while(j<=i && B<0){
                if(A.get(j)==0)
                B++;
                j++;
            }
            maxlen=Math.max(maxlen,i-j+1);
      }
    
      return maxlen;
    }
}
