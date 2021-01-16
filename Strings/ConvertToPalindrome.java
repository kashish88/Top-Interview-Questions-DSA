public class ConvertToPalindrome {
    public int solve(String A) {
        return func(A,0,A.length()-1,0)?1:0;
    }
    public boolean func(String A,int i,int j,int mismatch){
        if(i<j){
            if(A.charAt(i)==A.charAt(j)){
                return func(A,i+1,j-1,mismatch);
            }
            else{
                if(mismatch==0){
                    return func(A,i+1,j,mismatch+1)||func(A,i,j-1,mismatch+1);
                }
                return false;
            }
        }else{
            return true;
        }
    }
}
