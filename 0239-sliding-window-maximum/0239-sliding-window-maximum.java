import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int[] ans=new int[arr.length-k+1];
        Deque<Integer>dq=new LinkedList<>();
        int i=0,j=0;
        int ind=0;
        while(j<arr.length){
            while(!dq.isEmpty()&& arr[dq.peekLast()]<arr[j]){
                dq.pollLast();
            }
            dq.offerLast(j);
            if(j-i+1 <k)j++;
            else if(j-i+1 ==k ){
                ans[ind++]=arr[dq.peekFirst()];
                if(i== dq.peekFirst()){
                    dq.pollFirst();
                }
                i++;
                j++;
            }
        }
        
        return ans;
    }
}