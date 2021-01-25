public class MaximumPathInTraingle {
    public int solve(ArrayList<ArrayList<Integer>> A) {

        int n=A.size();
        int [][]dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int val=A.get(i).get(j);
                if(i==0){
                    dp[i][j]=A.get(i).get(j);
                }else if(j==0){
                    dp[i][j]=A.get(i).get(j)+dp[i-1][j];
                }else{
                    dp[i][j]=val+Math.max(dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,dp[n-1][i]);
        }
        return ans;
    }
}
