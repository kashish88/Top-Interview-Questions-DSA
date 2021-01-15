import java.util.*;
public class KLargestElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> al = new ArrayList<>();
       
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       
     
       for(int i=0; i<A.size(); i++){
           pq.add(A.get(i));
       }
       
    
       for(int i=0; i<B; i++){
           al.add(pq.poll());
       }
       return al;
   }
}
