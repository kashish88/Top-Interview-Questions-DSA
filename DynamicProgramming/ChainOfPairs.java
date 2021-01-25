import java.util.Arrays;

public class ChainOfPairs {
    public int solve(ArrayList<ArrayList<Integer>> A) {
 
        int dp[]=new int[A.size()];
        int max=1;
        Arrays.fill(dp, 1);
     
        for(int i=1;i<A.size();i++){
            for(int j=0;j<i;j++){
                if(A.get(j).get(1)<A.get(i).get(0)){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                    if(dp[i]>max)
                    max=dp[i];
                }
            }
        }
        return max;
    }
}
