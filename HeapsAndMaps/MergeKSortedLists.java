/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
import java.util.*;
public class MergeKSortedLists {
    public ListNode mergeKLists(ArrayList<ListNode> a) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new customCompare());
           int k=a.size();
           for(int i=0;i<k;i++){
               pq.add(a.get(i));
           }
           ListNode node=pq.poll();
           ListNode ans=node;
           ListNode head=ans;
           if(node.next!=null){
               pq.add(node.next);
           }
           while(!pq.isEmpty()){
               node.pq.poll();
               ans.next=node;
               ans=ans.next;
               if(node.next!=null){
                   pq.add(node.next);
               }
           }
             return head;
    }
    public class customCompare implements Comparator<ListNode>{
        public int compare(ListNode a, ListNode b){
            if(a.val>b.val){
                return 1;
            }
            else if(a.val<b.val){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
}
