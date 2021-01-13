/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class PartitionList {
    public ListNode partition(ListNode A, int B) {
        ListNode c=A;
        ListNode head=new ListNode(-1);
        head.next=A;
        ListNode prev=head;
        ListNode sh=new ListNode(-1);
        ListNode s=sh;
        while(c!=null){
            if(c.val<B){
                s.next=c;
                s=s.next;
                prev.next=c.next;
                c=c.next;
            }else{
                prev=c;
                c=c.next;
            }
        }
        s.next=head.next;
        return sh.next;
    
    }
}
