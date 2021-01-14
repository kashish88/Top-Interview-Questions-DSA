import java.util.*;
public class SearchInBitonicArray {
    public int solve(ArrayList<Integer> A, int B) {
        int posmax=-1;
        if(A.get(0)>A.get(1))
        posmax=0;
          if(A.get(A.size()-1)>A.get(A.size()-2))
        posmax=A.size()-1;
        int start=0,end=A.size()-1,mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(A.get(mid)>A.get(mid-1) && A.get(mid)>A.get(mid+1)){
            posmax=mid;
            break;
            }
            if(A.get(mid)>A.get(mid-1) && A.get(mid+1)>A.get(mid)){
              start=mid+1;
            }
            if(A.get(mid)<A.get(mid-1) && A.get(mid+1)<A.get(mid)){
              end=mid-1;
            }
        }
          start = 0;
        end = posmax;
        while(start<=end){
            mid = (start+end)/2;
            if(A.get(mid)==B){
                return mid;
            }
            if(A.get(mid)<B)
                start = mid+1;
            if(A.get(mid)>B)
                end = mid-1;
        }
        start = posmax;
        end = A.size()-1;
        while(start<=end){
            mid = (start+end)/2;
            if(A.get(mid)==B){
                return mid;
            }
            if(A.get(mid)>B)
                start = mid+1;
            if(A.get(mid)<B)
                end = mid-1;
        }
        return -1;
    }
}
