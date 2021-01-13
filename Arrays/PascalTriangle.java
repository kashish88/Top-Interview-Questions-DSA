import java.util.*;
public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        int nr=A;
        ArrayList<ArrayList<Integer>> r=new ArrayList<>();
        if(A==0){
            return r;
        }
        r.add(new ArrayList<>());
        r.get(0).add(1);
        for(int i=1;i<nr;i++){
            r.add(new ArrayList<>());
            r.get(i).add(1);
            for(int j=0;j<i-1;j++){
                int n1=r.get(i-1).get(j)+r.get(i-1).get(j+1);
                r.get(i).add(n1);
            }
            r.get(i).add(1);
        }
        return r;
    }
}
