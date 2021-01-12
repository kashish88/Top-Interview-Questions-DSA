/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class KreverseLinkedList {
    public ListNode reverseList(ListNode A, int B) {
        ListNode current = A;
         ListNode previous = null;
         ListNode next = null;
         
         int count=B;
         while(count-->0 && current!=null){
             next=current.next;
             current.next=previous;
             previous=current;
             current=next;
         }
         
         if(current!=null){
             A.next=reverseList(current, B);
         }
         
         return previous;
     }
}
