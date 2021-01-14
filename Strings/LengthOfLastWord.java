public class LengthOfLastWord {
    public int lengthOfLastWord(final String s) {
        int len=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
               i--;
        }
       
        for (i=i; i>=0; i--) {
            if (s.charAt(i) == ' ') {
                return len;
            }
            len++;
        }
        
        return len;


    }

}
