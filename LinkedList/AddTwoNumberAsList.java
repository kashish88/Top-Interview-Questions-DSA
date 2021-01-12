/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class AddTwoNumberAsList {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode l3=new ListNode(0);
ListNode curr=l3;
int sum=0,carry=0;
 
    while(A!=null || B!=null)
    {
        sum=carry;
        if(A!=null)
        {sum+=A.val;
        A=A.next;}
        if(B!=null)
        {sum+=B.val;
        B=B.next;}
        carry=sum/10;
        curr.next=new ListNode(sum%10);
        curr=curr.next;
        sum/=10;
       // l3=l3.next;
    }
    if(carry>0)
        curr.next=new ListNode(carry);
    return l3.next;
    }
}
