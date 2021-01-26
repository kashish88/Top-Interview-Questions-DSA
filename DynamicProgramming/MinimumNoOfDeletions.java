import java.util.*;
public class MinimumNoOfDeletions {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeks";
        int i = 0;
        int j = 0;
         
        // Initialize the array with -1
        for (int[] row: dp)
        {Arrays.fill(row, -1);}
         
        System.out.println("MINIMUM NUMBER OF DELETIONS: " +
                           (s1.length() - transformation(s1, s2, 0, 0)));
        System.out.println("MINIMUM NUMBER OF INSERTIONS: " +
                           (s2.length() - transformation(s1, s2, 0, 0)));
        System.out.println("LCS LENGTH: " + 
                           transformation(s1, s2, 0, 0));
    }
    static int dp[][] = new int[2000][2000];
    public static int transformation(String s1,String s2,int i, int j){
        if(i>=s1.length()|| j>=s2.length()){
            return 0;
        }
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]=1+transformation(s1, s2, i+1, j+1);
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        else{
             dp[i][j]=Math.max(transformation(s1,s2,i,j+i),transformation(s1, s2, i+1, j));
        }
        return dp[s1.length()-1][s2.length()-1];
    }
}
