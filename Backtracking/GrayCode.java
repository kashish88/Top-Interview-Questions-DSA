import java.util.*;
public class GrayCode {
    public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> res = new ArrayList<Integer>();
      if(a == 0){
          return res;
      }
      res.add(0);
      res.add(1);
      if(a== 1){
          return res;
      }
      while(a-- > 1){
          int n = res.size();
          for(int i = n-1; i >= 0; i--){
              res.add(n + res.get(i));
          }
      }
      return res;
  }
}
