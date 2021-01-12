public class PalindromeString {
    public int isPalindrome(String A) {
        int n=A.length();
        int st=0;
        int ed=n-1;
        while(st<ed){
            char head=A.charAt(st);
            head=Character.toLowerCase(head);
            if(!Character.isLetterOrDigit(head)){
                st++;
            }else{
                char tail=A.charAt(ed);
                tail=Character.toLowerCase(tail);
                 if(!Character.isLetterOrDigit(tail)){
                ed--;
            }else{
                if(head!=tail){
                    return 0;
                }
                st++;
                ed--;
            }
            }
        }
        return 1;
    }
}
