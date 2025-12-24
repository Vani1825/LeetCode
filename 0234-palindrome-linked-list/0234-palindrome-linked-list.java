import java.util.*;
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode prev=head;
        while(prev!=null){
            list.add(prev.val);
            prev=prev.next;
        }
        int size=list.size();
        int right=size-1;
        int left=0;
        while(left<right){
            if(!list.get(left).equals(list.get(right))){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}