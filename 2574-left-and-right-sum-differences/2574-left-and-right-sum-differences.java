class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftsum=0;
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            int rightsum=sum-nums[i]-leftsum;
            res[i]=Math.abs(rightsum-leftsum);
            leftsum+=nums[i];
        }
        return  res;
    }
}