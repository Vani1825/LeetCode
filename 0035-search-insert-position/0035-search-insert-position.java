class Solution {
    public int searchInsert(int[] nums, int target) {
     int index=-1;
     int left=0;
     int n=nums.length;
     int right=n-1;
     while(left<=right){
        int mid=(left+right)/2;
        if(nums[mid]<target){
            left=mid+1;
        }
        else if(nums[mid]>target){
            right=mid-1;
        }
        else
        return mid;
     }
     return left;
    }
}