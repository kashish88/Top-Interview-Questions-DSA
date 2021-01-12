/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class PalindromeList {
    public int lPalin(ListNode A) {
        ListNode mid=A,curr=A;
        int len=size(A);
        int count=len/2;
        while(count-->0){
            mid=mid.next;
        }
        ListNode rev=reverseNode(mid);
        for(int i=0;i<len/2;i++){
            if(curr.val!=rev.val){
                return 0;
            }
            curr=curr.next;
            rev=rev.next;
        }
        return 1;
    }
    public int size(ListNode node){
        int count=0;
        while(node!=null){
            ++count;
            node=node.next;
        }
        return count;
    }
    public ListNode reverseNode(ListNode node){
        ListNode curr=node,pre=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
        return pre;
    }
}
