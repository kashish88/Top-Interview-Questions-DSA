public class NutsandBolts {
    public static void main(String[] args) {
        char nuts[] = {'@', '#', '$', '%', '^', '&'};
        char bolts[] = {'$', '%', '&', '^', '@', '#'};
   
        matchPairs(nuts, bolts, 0, 5);

        System.out.println("Matched nuts and bolts are : ");
        printArray(nuts);
        printArray(bolts);
    }
    private static void printArray(char[] arr) {
        for (char ch : arr){
            System.out.print(ch + " ");
        }
        System.out.print("\n");
    }
    private static void matchPairs(char[] nuts, char[] bolts, int low, int high){
        if(low<high){
            int pivot=partition(bolts,low,high,bolts[high]);

            partition(bolts, low, high, nuts[pivot]);
            matchPairs(nuts, bolts, low, pivot-1);
            matchPairs(nuts, bolts, pivot+1, high);
        }
    }
    private static int partition(char[] arr, int low, int high, char pivot){
        
        int i=low;
        char temp1,temp2;
        for (int j = low; j < high; j++)
        {
            if (arr[j] < pivot){
                temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
            } else if(arr[j] == pivot){
                temp1 = arr[j];
                arr[j] = arr[high];
                arr[high] = temp1;
                j--;
            }
        }
        temp2 = arr[i];
        arr[i] = arr[high];
        arr[high] = temp2;

        // Return the partition index of an array based on the pivot 
        // element of other array.
        return i;
    }
}
