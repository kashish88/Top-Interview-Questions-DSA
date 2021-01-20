import java.util.*;

public class SubArraysWithDistinctIntegers {
    public int solve(ArrayList<Integer> A, int B) {
        return atmost(A,B)-atmost(A,B-1);
    }
    int atmost(ArrayList<Integer>A,int k){
        int count=0,left=0,right=0;
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        while(right<A.size()){
                    if(hash.containsKey(A.get(right))){
                        int c=hash.get(A.get(right));
                        hash.remove(A.get(right));
                        hash.put(A.get(right),c+1);
                    }
                    else{
                        hash.put(A.get(right),1);
                    }
                    while(hash.size()>k){
                        hash.put(A.get(left),hash.get(A.get(left))-1);
                       if (hash.get(A.get(left))==0){
                            hash.remove(A.get(left));
                        }
                        left++;
                    }
                    count+=right-left+1;
                    right++;
        }
        return count;
    }
}
