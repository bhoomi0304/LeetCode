
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(-1);
        ListNode c = h;
        while(l1 != null || l2!=null){
            if(l1==null){
                c.next=l2;
                l2=l2.next;
            }else if(l2==null||l1.val<l2.val){
                c.next=l1;
                l1=l1.next;
            }else {
                c.next=l2;
                l2=l2.next;
            }
        c=c.next;
        }
        return h.next;
    }
}
