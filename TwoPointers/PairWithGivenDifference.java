public class PairWithGivenDifference {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int size=A.length;
        int i=0;
        int j=1;
        while(i<size && j<size){
            if(i!=j && A[j]-A[i]==B){
                return 1;
            }
            else if (A[j] - A[i] < B) 
                j++; 
            else
                i++; 
        }
        return 0;
    }
}
