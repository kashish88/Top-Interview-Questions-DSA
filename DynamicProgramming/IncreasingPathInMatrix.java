import java.util.*;
public class IncreasingPathInMatrix {
    public int solve(ArrayList<ArrayList<Integer>> A) {

        int n=A.size();
        int m=A.get(0).size();

        boolean[][]ans=new boolean[n][m];
        ans[n-1][m-1]=true;
        for(int x=n-1;x>=0;x--){
            for(int y=m-1;y>=0;y--){
                int curVal = A.get(x).get(y);
                ans[x][y]=x<n-1 && currVal <A.get(x+1).get(y) && ans[x+1][y];
                ans[x][y]=y<m-1 && currVal <A.get(x).get(y+1) && ans[x][y+1];
            }
        }
       return ans[0][0]?n+m-1:-1;
    }
}
