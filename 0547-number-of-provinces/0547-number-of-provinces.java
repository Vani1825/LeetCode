class Solution {
    public int findCircleNum(int[][] grid) {
        int vis[]=new int[grid.length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            if(vis[i]==0){
            dfs(i,grid,vis);
            count++;
            }
        }
        return count;
    }
    public void dfs(int node , int[][]grid,int []vis){
        vis[node]=1;
        for(int j=0;j<grid.length;j++){
            if(grid[node][j]==1 && vis[j]==0)
            dfs(j,grid,vis);
        }
    }
}