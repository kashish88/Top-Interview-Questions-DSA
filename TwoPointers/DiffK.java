public class DiffK {
    public int diffPossible(int[] A, int B) {
        int size = A.length; 
       int i = 0, j = 1; 
  
       while (i < size && j < size) 
       { 
           if (i != j && A[j]-A[i] == B) 
           { 
             
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
