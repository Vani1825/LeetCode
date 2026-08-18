class Solution {
    private static void rightSmaller(int []right,int []h){
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<h.length;i++){
            while(!st.isEmpty() && h[st.peek()]>h[i]){
                int prev=st.pop();
                right[prev]=i;
            }
            st.push(i);
        }
    }
    private static void leftSmaller(int []left,int[] h){
        Stack<Integer>st=new Stack<>();
            for(int i=h.length-1;i>=0;i--){
                while(!st.isEmpty() && h[st.peek()]>h[i]){
                    int idx=st.pop();
                    left[idx]=i;
                }
                st.push(i);
            }
    }
    public int largestRectangleArea(int[] h) {
        int n=h.length;
        int left[]=new int[h.length];
        Arrays.fill(left, -1);
        int right[]=new int[h.length];
        Arrays.fill(right, n);
        int width[]=new int[h.length];
        int area[]=new int[h.length];
        rightSmaller(right,h);
        leftSmaller(left,h);
        for(int i=0;i<h.length;i++){
            width[i]=right[i]-left[i]-1;
            area[i]=width[i]*h[i];
        }
        int max=Integer.MIN_VALUE;
        for(int x:area){
            if(x>max){
                max=x;
            }
        }
        return max;
    }
}