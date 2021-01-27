import java.util.*;
public class FirstNegative {
    public static void main(String[] args) 
{
    int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
    int n = arr.length;
    int k = 3;
     
    printFirstNegativeInteger(arr, k, n);    
}
static void printFirstNegativeInteger(int arr[], 
                                      int k, int n)
 {
    int firstNegativeIndex = 0;
    int firstNegativeElement;

    for(int i=k-1;i<n;i++){
        while((firstNegativeIndex<i) && (firstNegativeIndex <=i-k || arr[firstNegativeIndex]>0)){
            firstNegativeIndex ++;
        }
        if (arr[firstNegativeIndex] < 0)
        {
            firstNegativeElement = arr[firstNegativeIndex];
        }
        else
        {
            firstNegativeElement = 0;
        }
        System.out.print(firstNegativeElement + " ");
    }
 }
}
