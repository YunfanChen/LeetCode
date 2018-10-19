# 206.Reverse_Linked_List
Reverse a singly linked list.
# Example :
```
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
```
# My Solution
```
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
        if(head==null||head.next==null) return head;
        ListNode newhead = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
}
```
# Solution 2:
```
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
```