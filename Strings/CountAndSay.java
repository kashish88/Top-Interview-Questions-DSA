public class CountAndSay {
    public String countAndSay(int A) {
        if(A==1){
            return "1";
        }
        return recur("1",A-1);
    }
    public String recur(String s,int A){
        if(A==0){
            return s;
        }
        StringBuilder sb=new StringBuilder();
        int count=1;
        char c=s.charAt(0);
        int n=s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i)!=c){
                sb.append(count);
                sb.append(c);
               count=1;
               c=s.charAt(i);
            }else{
                count++;
            }
        }
        sb.append(count);
        sb.append(c);
        return recur(sb.toString(),A-1);
    }
}
