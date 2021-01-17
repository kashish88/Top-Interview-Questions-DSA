/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class CopyList {
    public RandomListNode copyRandomList(RandomListNode head) {
     
        Map<RandomListNode,RandomListNode>mp=new HashMap<>();
        RandomListNode temp=head;
        RandomListNode clone=null;
        while(temp!=null){
           clone=new RandomListNode(temp.label);
           map.put(temp,clone);
           temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            clone=map.get(temp);
            clone.next=map.get(temp.next);
            clone.random=map.get(temp.random);
            temp=temp.next;
         }
        return map.get(head);
    }
}
