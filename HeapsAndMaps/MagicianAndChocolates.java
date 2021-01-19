import java.util.*;
public class MagicianAndChocolates {
    public int nchoc(int A, ArrayList<Integer> B) {
  
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<B.size();i++){
            pq.add(B.get(i));
        }

       long ans=0;
       for(int i=0;i<A;i++){
           int temp=pq.poll();
           ans=(ans+temp)%(long)(Math.pow(10,9)+7);
           pq.add(temp/2);
       }

       return (int)ans%(int)(Math.pow(10,9)+7);
    }
}
