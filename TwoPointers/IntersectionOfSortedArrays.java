import java.util.*;
public class IntersectionOfSortedArrays {
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> res= new ArrayList<Integer>();
      if(A==null || A.size()==0 || B==null || B.size()==0){
          return res;
      }
      int indexA=0;int indexB=0;
      while(indexA<A.size() && indexB<B.size()){
          if(A.get(indexA).equals(B.get(indexB))){
              res.add(A.get(indexA));
              indexA++;indexB++;
          }else if(A.get(indexA)<B.get(indexB)){
              indexA++;
          }else{
              indexB++;
          }
      }
      return res;
  }
}
