class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    grid[i][j]='0';
                    q.offer(new int[]{i,j});
                    while(!q.isEmpty()){
                        int curr[]=q.poll();
                        int r=curr[0];
                        int c=curr[1];
                        for(int k=0;k<4;k++){
                            int nr=r+dr[k];
                            int nc=c+dc[k];
                            if(nr>=0 && nr<row && nc>=0 && nc<col && grid[nr][nc]=='1'){
                                grid[nr][nc]='0';
                                q.offer(new int[]{nr,nc});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}