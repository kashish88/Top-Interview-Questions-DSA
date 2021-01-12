/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class RemoveNthNodeFromListEnd {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        int count=0;
        ListNode slow=A;
        ListNode fast=A;
        while(count++<=B && fast!=null){
            fast=fast.next;
        }
        if(count<B){
            return A.next;
        }
        if(fast==null)
         return slow.next;
         while(fast!=null){
              fast=fast.next;
              slow=slow.next;
         }
         slow.next=slow.next.next;
         return A;
    }
}
