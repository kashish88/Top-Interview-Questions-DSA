import java.util.*;
public class AddBinaryStrings {
    public String addBinary(String A, String B) {
        StringBuilder sb = new StringBuilder("");
     int i = A.length() - 1, j = B.length() -1, carry = 0;
     while (i >= 0 || j >= 0) {
         int sum = carry;
         if (j >= 0) sum += B.charAt(j--) - '0';
         if (i >= 0) sum += A.charAt(i--) - '0';
         sb.append(sum % 2);
         carry = sum / 2;
     }
     
     if(carry>0){
         sb.append(carry);
     }
     
     return sb.reverse().toString();
 }
}
