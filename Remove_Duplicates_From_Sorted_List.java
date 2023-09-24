
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
          ListNode t = head;
    while(t.next != null){
      if(t.val == t.next.val){
        t.next = t.next.next;
      }
      else{
        t = t.next;
      }
    }
    return head;
  }
}
