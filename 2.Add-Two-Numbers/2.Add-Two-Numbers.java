/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode h = p;
        int carry = 0;
        while(l1!=null||l2!=null||carry!=0){
            ListNode cur = new ListNode(0);
            int sum = ((l1==null)? 0 : l1.val) + ((l2==null)? 0: l2.val) + carry;
            carry = sum/10;
            cur.val = sum%10;
            p.next = cur;
            p = p.next;
            l1 = (l1==null)? l1 : l1.next;
            l2 = (l2==null)? l2 : l2.next;
        }
        return h.next;
    }
}