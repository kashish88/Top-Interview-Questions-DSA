package TopInterviewQuestionsDSA.Arrays;
import java.util.*;
public class MinimumStepsInInfiniteGrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int c=0;
        int x=0;
        int y=0;
        for(int i=0;i<A.size()-1;i++){
            x=Math.abs(A.get(i)-A.get(i+1));
            y=Math.abs(B.get(i)-B.get(i+1));
            c=c+Math.max(x,y);
        }
        return c;
    }
}
