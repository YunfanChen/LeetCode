/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode newhead = null;
        while(p!=null){
            ListNode tmp = p.next;
            p.next = newhead;
            newhead = p;
            p = tmp;
        }
        return newhead;
    }
}