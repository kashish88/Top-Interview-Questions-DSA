/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class KthNodeFromMiddle {
    public int solve(ListNode A, int B) {
        ListNode slow = A;
ListNode fast = A;
ListNode dummy = new ListNode(-1);
dummy.next = A;
ListNode result = dummy;
 
    int count = 1;
    while(fast != null){
        fast = fast.next;
        if(fast != null){
            fast = fast.next;
            slow = slow.next;
            count++;
            if(count > B){
                result = result.next;
            }
        }
    }
    return result != null ? result.val : -1;
    }
}
