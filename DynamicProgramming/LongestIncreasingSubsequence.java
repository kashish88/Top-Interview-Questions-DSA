import java.io.*;
import java.util.*;

public class LongestIncreasingSubSequence {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int omax=0;
        int[]dp=new int[n];
        for(int i=0;i<dp.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(a[j]<a[i]){
                    if(dp[j]>max){
                        max=dp[j];
                    }
                }
            }
            dp[i]=max+1;
            if(dp[i]>omax){
                omax=dp[i];
            }
        }
        System.out.println(omax);
    }

}