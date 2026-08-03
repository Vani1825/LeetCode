class Solution {
    public int maxArea(int[] h) {
        int left=0;
        int right=h.length - 1;
        int area=0;
        int max=0;
        while(left<=right){
            area=(right-left)*Math.min(h[right],h[left]);
            max=Math.max(max,area);
            if(h[left]<h[right])
            left++;
            else
            right--;
        }
        return max;
    }
}