class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] h = new int[cols];
        int max = 0;    
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == '1')
                    h[j]++;
                else
                    h[j] = 0;
            }
            max = Math.max(max, getArea(h, cols));
        }
        return max;
    }
    private static void nexttoleft(int left[],int h[],int n){
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && h[st.peek()]>h[i]){
                int idx=st.pop();
                left[idx]=i;
            }
            st.push(i);
        }
    }
    private static void nexttoright(int right[],int h[],int n){
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && h[st.peek()]>h[i]){
                int idx=st.pop();
                right[idx]=i;
            }
            st.push(i);
        }
    }
    private static int getArea(int h[],int n){
        int left[]=new int[n];
        Arrays.fill(left,-1);
        int right[]=new int[n];
        Arrays.fill(right,n);
        nexttoleft(left,h,n);
        nexttoright(right,h,n);
        int width[]=new int[n];
        int area[]=new int[n];
        for(int i=0;i<n;i++){
            width[i]=right[i]-left[i]-1;
            area[i]=width[i]*h[i];
        }
        int max=0;
        for(int it:area){
            if(max<it){
                max=it;
            }
        }
        return max;
    }
}