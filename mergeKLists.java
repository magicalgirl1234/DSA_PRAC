/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        //traverse and add to the list 
        for(ListNode node : lists)
        {
            if(node!=null)
            pq.add(node);

        }

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(!pq.isEmpty())
        {
            ListNode cur = pq.poll();
            temp.next = cur;
            temp = cur;
            if(cur.next!=null)
            {
                pq.add(cur.next);
            }
        }
        return dummy.next;



        
    }
}
