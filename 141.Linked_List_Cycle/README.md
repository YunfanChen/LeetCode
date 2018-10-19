# 141.Linked_List_Cycle
Given a linked list, determine if it has a cycle in it.
# My Solution
```
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        ListNode former=head;
        ListNode later=head;        
        while(former.next!=null&&former.next.next!=null){
            former=former.next.next;
            later=later.next;
            if(former==later) return true;
        }
        return false;
    }
}
```
