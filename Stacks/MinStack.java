public class MinStack {
    class Node{
        int val, min;
        Node next;
        
        Node(int val, int min){
            this.val = val;
            this.min = min;
            this.next = null;
        }
    }
    Node head;
    public void push(int x) {
        Node l1;
        if(head == null){
            l1 = new Node(x, x);
        } else {
            l1 = new Node(x, Math.min(x, head.min));
            l1.next = head;
        }
        head = l1;
    }
 
    public void pop() {
        if(head != null){
            head = head.next;
        }
    }
 
    public int top() {
        if(head == null){
            return -1;
        }
        return head.val;
    }
 
    public int getMin() {
        if(head == null){
            return -1;
        }
        return head.min;
    }
}
