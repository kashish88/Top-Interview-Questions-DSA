/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode A) {
        if(A==null || A.next==null)
        return A;
        ListNode insert,curr=A.next;
        while(curr!=null){
            insert=A;
            while(insert!=curr){
                if(insert.val<curr.val)
                insert=insert.next;
                else{
                    int t=curr.val;
                    curr.val=insert.val;
                    insert.val=t;
                }
            }
            curr=curr.next;
        }
        return A;
    }
}
