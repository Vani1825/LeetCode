class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        // while(head!=null && head.val==head.next.val){
        //     head.next=null;
        // }
        ListNode prev=head;
        while(prev!=null &&  prev.next!=null){
            if(prev.val==prev.next.val){
                prev.next=prev.next.next;
            }else
            prev=prev.next;
        }
        return head;
    }
}