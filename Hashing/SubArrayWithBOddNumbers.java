import java.util.*;
public class SubArrayWithBOddNumbers {
    public int solve(ArrayList<Integer> A, int B) {
         int oddCount=0;
         int subArrayCount=0;
         HashMap<Integer,Integer>oddCountMap=new HashMap<Integer,Integer>();
         oddCountMap.put(0,1);
         for(int i=0;i<A.size();i++){
            if (A.get(i) % 2 != 0){
                oddCount++;
            }
            subArrayCount += oddCountMap.getOrDefault(oddCount-B,0);
            oddCountMap.put(oddCount, oddCountMap.getOrDefault(oddCount,0)+1);
         }
         return subArrayCount;

    }
}
