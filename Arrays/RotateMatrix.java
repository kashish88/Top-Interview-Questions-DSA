import java.util.*;
public class RotateMatrix {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        transpose(a);
        for(int i=0;i<a.size();i++){
            Collections.reverse(a.get(i));
        }
    }
    void transpose(ArrayList<ArrayList<Integer>>arr){
        for(int i=0;i<arr.size();i++){
            for(int j=i;j<arr.get(0).size();j++){
                int t=arr.get(j).get(i);
                arr.get(j).set(i,arr.get(i).get(j));
                arr.get(i).set(j,t);
            }
        }
    }
}
