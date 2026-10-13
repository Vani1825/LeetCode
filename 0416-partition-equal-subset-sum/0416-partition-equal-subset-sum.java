class Solution {
    public boolean canPartition(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        boolean [][]dp=new boolean[n][target+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(arr[0]<=target)
        dp[0][arr[0]]=true;
        for(int i=1;i<n;i++){
            for(int t=0;t<=target;t++){
                boolean pick =false;
                if(arr[i]<=t){
                    pick=dp[i-1][t-arr[i]];
                }
                boolean notpick=dp[i-1][t];
                dp[i][t]=pick||notpick;
            }
        }
        return dp[n-1][target];
    }
}