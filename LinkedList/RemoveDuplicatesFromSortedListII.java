/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode prev=null;
        ListNode curr=A;
        ListNode nh=A;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
                while(curr.next!=null && curr.val==curr.next.val){
                    curr=curr.next;
                }
                curr=curr.next;
                if(prev==null){
                    nh=curr;
                }else{
                    prev.next=curr;
                }
            }else{
                prev=curr;
                curr=curr.next;
            }
        }
        return nh;
    }
}
