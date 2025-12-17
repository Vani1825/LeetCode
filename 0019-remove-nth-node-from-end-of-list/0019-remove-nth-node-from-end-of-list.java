class Solution {
    public int length(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = length(head);
        int m=len-n;
         if (n == len) {
            return head.next;
        }
        ListNode prev=head;
        for(int i=1;i<m;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}