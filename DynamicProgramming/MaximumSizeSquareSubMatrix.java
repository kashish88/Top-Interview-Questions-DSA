public class MaximumSizeSquareSubMatrix {
    int[][] dp;
    public int solve(ArrayList<ArrayList<Integer>> A) {


        int n=A.size();
        int m=A.get(0).size();
        dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(A.get(i-1).get(j-1)==0)
                dp[i][j]=0;
                else
                dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));

                max=Math.max(dp[i][j],max);
            }
        }
        return max*max;
    }
}
