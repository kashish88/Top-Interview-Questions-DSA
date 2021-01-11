public class FindDuplicateInArray {
    public int repeatedNumber(final List<Integer> A) {
        Integer tortoise = A.get(0);
         Integer hare = A.get(0);
         do {
             tortoise = A.get(tortoise);
             hare = A.get(A.get(hare));
         } while (!tortoise.equals(hare));
         
        
         tortoise = A.get(0);
         while(!tortoise.equals(hare)) {
             tortoise = A.get(tortoise);
             hare = A.get(hare);
         }
         
         return hare;
     }
}
