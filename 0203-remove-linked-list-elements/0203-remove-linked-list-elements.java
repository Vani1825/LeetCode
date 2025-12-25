class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        while(head!=null && head.val==val){
                head= head.next;
            }
        ListNode prev=head;
        while(prev!=null && prev.next!=null){
            if(prev.next.val==val){
                prev.next=prev.next.next;
            }else 
            prev=prev.next;
        }
        return head;
    }
}