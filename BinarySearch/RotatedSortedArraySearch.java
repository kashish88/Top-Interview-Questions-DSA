public class RotatedSortedArraySearch {
    public int search(final List<Integer> A, int B) {

        int i=0;
        int j=A.size()-1;
        while(i<=j){
            mid=(i+j)/2;
            if(A.get(mid)==B)
            return mid;
            if(A.get(mid)>=A.get(i)) {
	            if(B>=A.get(i)&&B<A.get(mid))
	                j=mid-1;
	            else
	                i=mid+1;
            }
            else {
	            if(B>A.get(mid)&&B<=A.get(j))
	                i=mid+1;
	            else
	                j=mid-1;
	        }
        }

        return -1;
    }
}
