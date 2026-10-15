class Solution {
    public int[] searchRange(int[] nums, int target) {
       int a[]=new int[2];
       a[0]=findFirst(nums,target);
       a[1]=findLast(nums,target);
       return a;
    }
    public int findFirst(int nums[],int target){
         int left=0;
         int ans=-1;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }   
        return ans;
    }
    public int findLast(int nums[],int target){
         int left=0;
         int ans=-1;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            
    }return ans;
    }
}