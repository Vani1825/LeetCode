class Solution {
    public int[] productExceptSelf(int[] nums) {
           int ans[]=new int[nums.length];
           int prefix=1;
           int n=nums.length;
           for(int i=0;i<n;i++){
            ans[i]=prefix;
            prefix*=nums[i];
           }
           int suffix=1;
           for(int i=n-1;i>=0;i--){
            ans[i]*=suffix;
            suffix*=nums[i];
           }
           return ans;
    }
}