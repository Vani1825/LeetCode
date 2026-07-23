class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int mod=1000000007;
        if(k==1)
          return (int)(Math.max(0, kadane(arr)) % mod);;

        long total=0;
        for(int x:arr)total+=x;
        int [] copy=new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
            copy[i+arr.length]=arr[i];
        }
        long maxdouble=kadane(copy);
        if(total>0)
        maxdouble+=(long)(k-2)*total;

        return (int)(Math.max(0,maxdouble)%mod);
    }
    private long kadane(int arr[]){
        long currsum=arr[0];
        long ans=arr[0];
        for(int i=1;i<arr.length;i++){
            currsum=Math.max(arr[i],arr[i]+currsum);
            ans=Math.max(currsum,ans);
        }
        return ans;
    }

}