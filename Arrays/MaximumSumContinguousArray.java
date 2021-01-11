package TopInterviewQuestionsDSA.Arrays;

public class MaximumSumContinguousArray {
    public int maxSubArray(final int[] A) {
        int m1=A[0];
   int m2=A[0];
  for(int i=1;i<A.length;i++){
      m1=Math.max(A[i],m1+A[i]);
      if(m1>m2)
      m2=m1;
  }
  return m2;
  }
}
