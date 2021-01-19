import java.util.*;
public class LongestPalindromicSubSequence {
    public int solve(String A) {

        int [][]dp=new int[A.length][A.lenght];
        for(int i=0;i<A.length();i++){ //Every single character is a palindrome of length 1
            dp[i][i]=1;
        }

        for(int d=1;d<A.length();d++){
            int i=0,j=d;
            while(j<A.length()){
                if(A.charAt(i)!=A.charAt(j)){ // IF first and last characters are not same
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }else if(j==i+1){  //if there are two characters and both same
                    dp[i][j]=2;
                }
                else{ // more than 2 characters but last and first same
                    dp[i][j]=dp[i+1][j-1]+2;
                }
                i++;
                j--;
            }
        }
        
        return dp[0][A.length()-1];
    }
}
