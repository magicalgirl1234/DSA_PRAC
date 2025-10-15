/*
// Representation of a node
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        int n = arr.length;
        
        Node head = new Node(arr[0]);
        Node cur = head;
        
        for(int i = 1 ; i< n ; i++)
        {
            cur.next = new Node(arr[i]);
            cur = cur.next;
        }
        
        return head;
       
        
    }
}
