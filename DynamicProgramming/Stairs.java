public class Stairs {
    public int climbStairs(int A) { 
 
        if(A==0)
          return 0;

        int []dp=new int[A+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
       return dp[A];
    }
}
