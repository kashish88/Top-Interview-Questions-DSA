public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] A) {
        StringBuilder result = new StringBuilder();
       
       if(A.length == 0) return result.toString();
       
   
       Arrays.sort(A);
       
     
       String first = A[0];
       String last = A[A.length-1];
       
       int minlen = Math.min(first.length(), last.length());
       
       int i=0;
       while(i < minlen){
           
           if(first.charAt(i) == last.charAt(i))
             
               result.append(first.charAt(i));
           else
             
               break;
           
           i++;
       }
       
       return result.toString();
   }
}
