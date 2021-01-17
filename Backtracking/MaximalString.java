public class MaximalString {
    
   int max=0;
   void swap(char []A,int i,int j){
    char temp=A[i];
    A[i]=A[j];
    A[j]=temp;
   }
 void generate(char []A,int B){
     if(B==0)
     return ;

     for(int i=0;i<A.length-1;i++){
         for(int j=i+1;j<A.length;j++){
               if(A[j]>A[i]){
                   swap(A,j,i);
                   int temp=Integer.parseIt(String.valueOf(A));
                   max=Math.max(max,temp);
                   generate(A,B-1);
                   swap(A,j,i);
               }
         }
     }
 }











    public String solve(String A, int B) {
          char []S=A.toCharArray();
        generate(S,B);
        return String.valueOf(max);

    }
}
