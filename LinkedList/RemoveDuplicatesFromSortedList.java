/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode p=A;
        while(p!=null && p.next!=null){
            if(p.next.val==p.val){
                p.next=p.next.next;
            }else{
                p=p.next
            }
        }
        return A;
    }
}
