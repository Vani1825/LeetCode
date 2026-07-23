class Solution {
    public int maximumSum(int[] arr) {
        int nodelete=arr[0];
        int onedelete=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            int prevno=nodelete;
            onedelete=Math.max(onedelete+arr[i],prevno);
            nodelete=Math.max(arr[i],prevno+arr[i]);
            ans=Math.max(ans,Math.max(onedelete,nodelete));
        }
        return ans;
    }
}