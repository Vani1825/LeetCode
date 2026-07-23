class Solution {
    public int maxProduct(int[] a) {
        int maxending=a[0];
        int minending=a[0];
        int ans=a[0];
        for(int i=1;i<a.length;i++){
            int v1=a[i];
            int v2=maxending*a[i];
            int v3=minending*a[i];
            maxending=Math.max(v1,Math.max(v2,v3));
            minending=Math.min(v1,Math.min(v2,v3));
            ans=Math.max(ans,Math.max(maxending,minending));
        }
        return ans;
    }
}