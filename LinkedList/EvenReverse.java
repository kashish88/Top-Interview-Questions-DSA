/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class EvenReverse {
    public ListNode solve(ListNode A) {
        Stack<Integer>st=new Stack<Integer>();
        ListNode t1=A;
        ListNode t2=A;
        int n1=1;
        while(t1!=null){
            if(n1%2==0){
                st.push(t1.val);
            }
            n1++;
            t1=t1.next;
        }
           int n2=1;
          while(t2!=null){
            if(n2%2==0){
               t2.val=st.pop();
            }
            n2++;
            t2=t2.next;
        }
         return A;
        
    }
}
