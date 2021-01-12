public class RemoveConsecutiveCharacter {
    public String solve(String A, int B) {
        String res = "";
        for(int i = 0; i < A.length(); ) {
            int j = i;
            while(j < A.length() && A.charAt(j) == A.charAt(i)) {
                j++;
            }
            if(j - i == B) {
                i = j;
            } else {
                res += A.charAt(i);
                i++;
            }
        }
        return res;
    }
}
