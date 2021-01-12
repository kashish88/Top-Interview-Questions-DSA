/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A==null) return B;
if(B==null) return A;
if(A.val<B.val){
A.next=mergeTwoLists(A.next,B);
return A;
}
else{B.next=mergeTwoLists(B.next,A);
return B;}
    }
}
