class Solution {
    public int longestOnes(int[] nums, int k) {
     int i=0,j=0,zero=0;
     int ans =0;
     while(j<nums.length){
        if(nums[j]==0)zero++;
        if(zero >k){
            if(nums[i]==0)zero--;
            i++;
        }
        ans=Math.max(ans,j-i+1);
        j++;
     }   
     return ans;
    }
}