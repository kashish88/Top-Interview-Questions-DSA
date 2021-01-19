import java.util.*;
public class PaintHouse {
    public int solve(ArrayList<ArrayList<Integer>> A) {

       if(A==null || A.size()==0)
       return 0;
       int n=A.size();
       int dp[]=new int[3];
       dp[0]=A.get(0).get(0);
       dp[1]=A.get(0).get(1);
       dp[2]=A.get(0).get(2);
       int t1=0,t2=0,t3=0;
       for(int i=1;i<n;i++){
           t1=dp[0];
           t2=dp[1];
           t3=dp[2];
           dp[0]=A.get(i).get(0)+Math.min(t2,t3);
           dp[1]=A.get(i).get(1)+Math.min(t1,t3);
           dp[2]=A.get(i).get(2)+Math.min(t1,t2);
       }
      return Math.min(dp[0],Math.min(dp[1],dp[2]));
    }
}
