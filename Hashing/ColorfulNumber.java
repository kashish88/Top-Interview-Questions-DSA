import java.util.*;
public class ColorfulNumber {
    public int colorful(int A) {
        String s = Integer.toString(A);
        int l = s.length();
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<l; i++) {
            int prod = 1;
            for(int j = i; j<l; j++) {
                prod = prod * (s.charAt(j) - '0');
                if(set.contains(prod)) {
                    return 0;
                }
                else {
                    set.add(prod);
                }
            }
        }
        return 1;
    }
}
