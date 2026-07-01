import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        ArrayList<Integer>ans=new ArrayList<>();
        Deque<Integer>dq=new LinkedList<>();
        int i=0,j=0;
        while(j<arr.length){
            while(!dq.isEmpty()&& dq.peekLast()<arr[j]){
                dq.pollLast();
            }
            dq.offerLast(arr[j]);
            if(j-i+1 <k)j++;
            else if(j-i+1 ==k ){
                ans.add(dq.peekFirst());
                if(arr[i]== dq.peekFirst()){
                    dq.pollFirst();
                }
                i++;
                j++;
            }
        }
        int nums[]=new int[ans.size()];
        int ind=0;
        for(int num :ans){
                nums[ind]=num;
                ind++;
        }
        return nums;
    }
}