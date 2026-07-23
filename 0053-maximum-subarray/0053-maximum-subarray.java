class Solution {
    public int maxSubArray(int[] nums) {
     int bestending=nums[0];
     int ans=nums[0];
     for(int i=1;i<nums.length;i++){
        int v1=nums[i];
        int v2=bestending+nums[i];
        bestending=Math.max(v1,v2);
        ans=Math.max(ans,bestending);
     }
     return ans;
    }
}