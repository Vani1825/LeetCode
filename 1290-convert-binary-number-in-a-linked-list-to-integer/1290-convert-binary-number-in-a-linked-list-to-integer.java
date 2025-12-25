class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        int index=0;
    ListNode temp=head;
    int sum=0;
        while(temp!=null){
            sum+=temp.val * (Math.pow(2,index));
            index++;
            temp=temp.next;
        }
        return sum;
    }
}