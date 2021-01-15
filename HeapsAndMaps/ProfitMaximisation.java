import java.util.*;
public class ProfitMaximisation {
    public int solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer>pq=new PriorityQueue(Collections.reverseOrder());
        for(int i:A){
            pq.offer(i);
        }
        int res=0;
        while(B-->0){
            int t=pq.poll();
            res+=t;
            pq.offer(t-1);
        }
        return res;
    }
}
