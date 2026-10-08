class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int [n][m];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return solve(n-1,m-1,dp,grid);
    }
    public static int solve(int i,int j,int [][]dp,int grid[][]){
        if(i<0 || j<0){
            return 0;
        }
         if(grid[i][j]==1){
             return 0;
        }
        if(i==0 && j==0){
            return 1;
        }
           if(dp[i][j]!=-1){
                return dp[i][j];
            }
            return dp[i][j]=solve(i-1,j,dp,grid)+solve(i,j-1,dp,grid);
    }
}