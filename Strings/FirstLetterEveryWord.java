public class FirstLetterEveryWord {
    static String firstLetterWord(String str) {
 
        String result="";
        boolean f=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                f=true;
            }
            else if (str.charAt(i) != ' ' && v == true) {
                result += (str.charAt(i));
                v = false;
            }
        }
        return result;

    }
    public static void main(String[] args) 
    {
        String str = "geeks for geeks";
        System.out.println(firstLetterWord(str));
    }
}
