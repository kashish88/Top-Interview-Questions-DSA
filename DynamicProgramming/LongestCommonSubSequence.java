import java.util.*;
public class LongestCommonSubSequence {
    public int solve(String A, String B) {
       
        char[]X=A.toCharArray();
        char[]Y=A.toCharArray();

        return lcs(X,Y,A.length(),B.length());
    }
    public int lcs(char []X,char[]Y,int m,int n){
        int L[][]=new int[m][n];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
          
                if(X[i-1]==Y[j-1]){
                    L[i][j]=L[i-1][j-1]+1;
                }else{
                    L[i][j]=Math.max(L[i-1][j],L[i][j-1]);
                }

            }
        }
        return L[m][n];
    }
}
