import java.util.*;

public class SortArrayWithSquares {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
      
        ArrayList<Integer> R = new ArrayList<>();
        int i = 0, j = A.size() - 1;
        while(i<=j)
        {
            if(Math.abs(A.get(i)) > Math.abs(A.get(j)))
            {
                R.add(A.get(i)*A.get(i));
                i++;
            }
            else
            {
                R.add(A.get(j)*A.get(j));
                j--;
            }
        }
       Collections.reverse(R);
        return R;
    }
}
