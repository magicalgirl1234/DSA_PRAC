/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
       
       Node cur =new Node(x);
       
      cur.next = head;
      head=cur;
        
       
       return head;
        
    }
}
