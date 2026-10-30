class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int x:nums){
            sum+=x;
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int rightsum=sum-nums[i]-leftsum;
            if(leftsum==rightsum)return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}