class Solution {
    public int[] sortedSquares(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        int n=nums.length;
        int left=0;
        int right=n-1;
        int index=n-1;
          int[] ans = new int[n];

        while (left<=right){
            int lefts=nums[left]*nums[left];
            int rights=nums[right]*nums[right];
            if(lefts>rights){
                ans[index]=lefts;
                left++;
            }
            else{
                ans[index]=rights;
                right--;
                }
                index--;
        }
        return ans;
    }
}