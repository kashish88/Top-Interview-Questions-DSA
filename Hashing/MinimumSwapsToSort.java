import java.util.*;
import java.io.*;
public class MinimumSwapsToSort {
    public static void main(String[] args) 
    throws Exception
{
int[] a
= { 101, 758, 315, 730, 472, 
 619, 460, 479 };
int n = a.length;
// Output will be 5
System.out.println(new GfG().minSwaps(a, n));
}
}
class GfG {
    public int minSwaps(int[] arr, int N){
        int ans=0;
        int []temp=Arrays.copyOfRange(arr, 0, N);
        HashMap<Integer, Integer> h
        = new HashMap<Integer, Integer>();
        Arrays.sort(temp);
        for (int i = 0; i < N; i++) 
        {
            h.put(arr[i], i);
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] != temp[i]) {
                ans++;
                int init = arr[i];
                swap(arr, i, h.get(temp[i]));
                h.put(init, h.get(temp[i]));
                h.put(temp[i], i);
            }
        }
        return ans;
    }
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
