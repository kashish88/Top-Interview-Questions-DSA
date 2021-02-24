import java.util.*;

public class DoublePairArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println(solution(a));
    }
    public static boolean solution(int []a){
        if(a.length==0)
        return true;

        HashMap<Integer,Integer>freqMap=new HashMap<>();
        for(int ele:arr)
        freqMap.put(ele,map.getOrDefault(ele,0)+1);

        Integer[]ar=new Integer[a.length];
        for(int i=0;i<a.length;i++){
            ar[i]=a[i];
        }
        Arrays.sort(ar,(a1,b)->{
            return Math.abs(a1)-Math.abs(b);
        });

        for(Integer ele:ar){
            if(freqMap.get(ele)==0)
            continue;

            if(freqMap.getOrDefault(2*ele, 0)==0)
            return false;

            freqMap.put(ele,freqMap.get(ele)-1);
            freqMap.put(2*ele,freqMap.get(2*ele)-1);
        }

        return true;
    }
}