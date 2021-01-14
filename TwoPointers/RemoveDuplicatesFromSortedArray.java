import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(ArrayList<Integer> a) {
        int j=0;
        for(int i=0;i<a.size();i++){
            if(!a.get(i).equals(a.get(j))){
                j++;
                a.set(j,a.get(i));
            }
        }
        return j+1;
    }
    
}
