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
    public ListNode addTwoNumbers(ListNode L, ListNode LL) {
        ListNode l = new ListNode(0);
        ListNode current = l;
        int carry = 0;
        while(L != null || LL != null || carry != 0) {
            int a = (L!= null) ? L.val : 0;
            int b = (LL != null) ? LL.val : 0;
            int sum = carry + a + b;
            carry = sum / 10;
            int newNodeVal = sum % 10;
            current.next = new ListNode(newNodeVal);
            current = current.next;
            if (L != null) L = L.next;
            if (LL != null) LL = LL.next;
        }
        l = l.next;

        return l;
    }
}
