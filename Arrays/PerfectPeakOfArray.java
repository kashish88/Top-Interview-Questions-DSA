import java.util.*;
public class PerfectPeakOfArray{
    public int perfectPeak(ArrayList<Integer> A) {
        int l=A.size();
        int max[]=new int[l];
        int min[]=new int[l];
        max[0]=A.get(0);
        min[l-1]=A.get(l-1);
        
        for(int i=1;i<l;i++)
        max[i]=Math.max(max[i-1],A.get(i));
        
        for(int i=l-2;i>=0;i--)
        min[i]=Math.min(min[i+1],A.get(i));
        
        for(int i=1;i<l-1;i++)
        {
            if(A.get(i)>max[i-1]&&A.get(i)<min[i+1])
            return 1;
        }
        
        return 0;
    }
}