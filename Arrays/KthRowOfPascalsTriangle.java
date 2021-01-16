import java.util.*;

public class KthRowOfPascalsTriangle{
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> ans = new ArrayList<>();        
        for (int i = 0; i <= A; i++) {
            final ArrayList<Integer> tempAns = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if(j==0||j==i)
                    tempAns.add(1);
                else
                    tempAns.add(ans.get(j-1) + ans.get(j));
            }
            ans = tempAns;
        }
        return ans;
    }
}