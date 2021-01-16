import java.util.*;
public class TwoSum {
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<A.size();i++){
            int curr=A.get(i);
            if(mp.containsKey(B-curr)){
                int in=mp.get(B-curr);
                ans.add(in);
                ans.add(i+1);
                return ans;
            }else if(!mp.containsKey(curr)){
                mp.put(curr,i+1);
            }
        }
        return ans;
    }
}
