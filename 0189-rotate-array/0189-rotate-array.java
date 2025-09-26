import java.util.Arrays;
class Solution {
    public void rotate(int[] nums, int k) {
        int a[]=new int[nums.length];
        int l=nums.length;
        k=k%l;
        for(int i=0;i<l;i++){
            a[(i+k)%l]=nums[i];
        }
        for (int i = 0; i < l; i++) {
            nums[i] = a[i];
        }
            System.out.print(Arrays.toString(a));        
    }
}