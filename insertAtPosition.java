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
    public Node insertPos(Node head, int pos, int val) {
        
        Node temp = head;
        Node cur = new Node(val);
        
        if(pos==1)
        {
            cur.next=head;
            head=cur;
            return cur;
        }
        
        
        
        
        for(int i = 1; i< pos-1 && temp!=null ; i++)
        {
            temp= temp.next;
        }
        
        if(temp==null)
        {
            return head;
        }
        
        
        cur.next= temp.next;
        temp.next=cur;
        
        return head;

    }
}
