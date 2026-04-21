class Solution {
    // public int climbStairs(int n) {
    //     return climb(0, n);

    // }
    // public int climb(int curr, int n) {
    //     if (curr == n) {
    //         return 1;
    //     }
    //     if (curr > n) {
    //         return 0;
    //     }

    //     return climb(curr + 1, n) + climb(curr + 2, n);
    // }
     public int climbStairs(int n) {
        int prev0=1;
        int prev1=1;
        for(int i=2;i<=n;i++){
            int curr=prev1+prev0;
            prev0=prev1;
            prev1=curr;
        }
        return prev1;
    }
   
}