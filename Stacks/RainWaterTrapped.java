import java.util.*;
public class RainWaterTrapped {
    public int trap(final List<Integer> A) {
        int a=0;
  int b=A.size()-1;
  int max=0;
  int leftmax=0;
  int rightmax=0;
  while(a<=b){
      leftmax=Math.max(leftmax,A.get(a));
      rightmax=Math.max(rightmax,A.get(b));
      if(leftmax<rightmax){
          max+=(leftmax-A.get(a));       // leftmax is smaller than rightmax, so the (leftmax-A[a]) water can be stored
          a++;
      }
      else{
          max+=(rightmax-A.get(b));
          b--;
      }
  }
  return max;
  }
}
