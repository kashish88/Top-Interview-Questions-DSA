import java.util.ArrayList; 
import java.util.Deque; 
import java.util.LinkedList; 
public class AllPossiblePalindromicPartition {
    public static void main(String[] args)  
    { 
        String input = "nitin"; 
  
        System.out.println("All possible palindrome" +  
                            "partions for " + input  
                            + " are :"); 
  
        allPalPartitions(input); 
    } 
    private static void allPalPartitions(String input)  {
        int n=input.length();
        ArrayList<ArrayList<String>>allPart=new ArrayList<>();
        // To store current palindromic partition 
        Deque<String>currPart=new LinkedList<String>();

        allPalPartitionsUtil(allPart,currPart,0,n,input);

        for(int i=0;i<allPart.size();i++){
            for (int j = 0; j < allPart.get(i).size(); j++){
                System.out.print(allPart.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    // Recursive function to find all palindromic 
    // partitions of input[start..n-1] allPart --> A 
    // ArrayList of Deque of strings. Every Deque 
    // inside it stores a partition currPart --> A 
    // Deque of strings to store current partition
    private static void  allPalPartitonsUtil(ArrayList<ArrayList<String>> allPart, Deque<String> currPart, int start, int n, String input) 
    {
        if(start>=n){
            allPart.add(new ArrayList<>(currPart));
            return ;
        }
        for(int i=start;i<n;i++){
            if(isPalindrome(input,start,i)){
                currPart.addLast(input.substring(start,i+1));
                allPalPartitonsUtil(allPart, currPart, i + 1, n, input); 
               // Remove substring str[start..i] from current 
                // partition
                currPart.removeLast(); 
            }
        }
    }
    private static boolean isPalindrome(String input,  
    int start, int i) 
{ 
while (start < i)  
{ 
if (input.charAt(start++) != input.charAt(i--)) 
return false; 
} 
return true; 
} 
}
