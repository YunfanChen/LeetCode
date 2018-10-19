/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode p = newhead;
        while(p.next!=null&&p.next.next!=null){
            ListNode n1 = p.next;
            ListNode n2 = p.next.next;
            p.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            p=n1;
        }
        return newhead.next;
    }
}