/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
       
       Node temp = head;
       Node cur = new Node(x);
       if(head==null) return cur;
       
       while(temp.next!=null)
       {
           temp = temp.next;
       }
       
       temp.next = cur;
       return head;
        
    }
}
