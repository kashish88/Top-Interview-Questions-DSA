import java.util.*;
public class MergeKSortedArrays {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        
        
        for(int i=0;i<A.size();i++){
            
           ArrayList<Integer> list = A.get(i);
           for(int a: list){
               pq.add(a);
           }
        }
        ArrayList<Integer>  ans = new ArrayList();
        while(!pq.isEmpty()){
            
            ans.add(pq.poll());
        }
        return ans;
    }
}
