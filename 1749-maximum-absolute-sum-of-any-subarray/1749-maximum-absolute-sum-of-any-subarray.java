class Solution {
    public int maxAbsoluteSum(int[] a) {
        int maxsum=a[0];
        int maxending =a[0];
        int minsum=a[0];
        int minending=a[0];
        for(int i=1;i<a.length;i++){
            maxending=Math.max(a[i],maxending+a[i]);
            maxsum=Math.max(maxsum,maxending);
            minending=Math.min(a[i],minending+a[i]);
            minsum=Math.min(minsum,minending);
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}