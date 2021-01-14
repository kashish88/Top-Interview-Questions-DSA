import java.util.*;
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(ArrayList<Integer> a) {
        int n=a.size();
        if(n<=2){
            return n;
        }
        int l=2;
        for(int i=2;i<n;i++){
            if(!a.get(i).equals(a.get(l-2))||!a.get(i).equals(a.get(l-1))){
                a.set(l,a.get(i));
                l++;
            }
        }
        return l;
    }
}
