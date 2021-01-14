public class AmazingSubArrays {
    public int solve(String A) {
        int size = A.length();

      int count = 0;
      for(int index = 0; index<size; ++index){
             if(A.charAt(index)=='a'||A.charAt(index)=='A'||A.charAt(index)=='e'||A.charAt(index)=='E'||A.charAt(index)=='i'||A.charAt(index)=='I'||A.charAt(index)=='o'||A.charAt(index)=='O'||A.charAt(index)=='u'||A.charAt(index)=='U'){
            
              count += size-index;
          }
      }
      return count%10003;
  }
}
