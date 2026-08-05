class Solution {
    public int orangesRotting(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        Queue<int []>q=new LinkedList<>();
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        int fresh =0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1)fresh++;
            }
        }
        if(fresh==0)return 0;
        int minutes=0;
        while(!q.isEmpty()){
            int size=q.size();
           for(int k=0;k<size;k++){
            int curr[]=q.poll();
            int row=curr[0];
            int col=curr[1];
            for(int m=0;m<4;m++){
                int nr=row+dr[m];
                int nc=col+dc[m];
                if(nr>=0 && nc>=0 && nr<r && nc<c && grid[nr][nc]==1){
                    grid[nr][nc]=2;
                    fresh--;
                    q.offer(new int[]{nr,nc});
                }
            }
           }
             if(!q.isEmpty())minutes++;
        }

        if(fresh==0)
        return minutes;
        else 
        return -1;
    }
}