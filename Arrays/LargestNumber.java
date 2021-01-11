import java.util.*;

public class LargestNumber {
    public String largestNumber(final List<Integer> A) {
        String []arr=new String[A.size()];
        for(int i=0;i<A.size();i++){
            arr[i]=String.valueOf(A.get(i));
        }
        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String a,String b){
                return (b+a).compareTo(a+b);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            sb.append(s);
        }
        if(sb.charAt(0)=='0'){
            return String.valueOf(0);
        }
        return sb.toString();
    }
}
