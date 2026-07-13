class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
         int leftsum[]=new int[n];
         int rightsum[]=new int[n];
         for(int i=1;i<n;i++){
            leftsum[i]=leftsum[i-1]+nums[i-1];
         }
         for(int j=n-2;j>=0;j--){
            rightsum[j]=nums[j+1]+rightsum[j+1];
         }

         for(int i=0;i<n;i++){
            if(rightsum[i]==leftsum[i])return i;
         }
         return -1;
    }
}