import java.util.*;
public class MaximumSumCombinations {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
     Collections.sort(A);
     Collections.sort(B);
     for(int i = A.size() - 1; i >= 0; i--) {
         for(int j = B.size() - 1; j >= 0; j--) {
             int sum = A.get(i) + B.get(j);
             if(minHeap.size() < C) {
                 minHeap.add(sum);
             } else if(minHeap.peek() < sum) {
                 minHeap.poll();
                 minHeap.add(sum);
             } else {
                 break;
             }
         }
     }
     ArrayList<Integer> result = new ArrayList<>(minHeap);        
     Collections.sort(result, Comparator.reverseOrder());
     return result;
 }
}
