
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

public class SortBinaryLinkedList {
    public ListNode solve(ListNode A) {
        if(A==null)return A;
    ListNode t1 = A,t2 = A.next;

    while(t2!=null){
        if(t1.val==1 && t2.val==0){
           int t=t1.val;
           t1.val=t2.val;
           t2.val=t;
        }
        if(t1.val==0)t1=t1.next;
        t2=t2.next;
    }
    return A;
    }
}
