class Solution {
    public int maxSubarraySumCircular(int[] a) {
        int total=0;
        for(int num:a){
        total+=num;
        }
        int maxending=a[0];
        int maxans=a[0];
        for(int i=1;i<a.length;i++){
            int v1=a[i];
            int v2=maxending+a[i];

            maxending=Math.max(v1,v2);
            maxans=Math.max(maxans,maxending);
        }
        int minending=a[0];
        int minans=a[0];
         for(int i=1;i<a.length;i++){
            int v1=a[i];
            int v2=minending+a[i];

            minending=Math.min(v1,v2);
            minans=Math.min(minans,minending);
        }
        if(maxans<0)return maxans;
        return Math.max(maxans,total-minans);
    }
}