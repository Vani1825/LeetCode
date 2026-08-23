class Solution {
    public int swimInWater(int[][] grid) {
        int t=grid[0][0];
        PriorityQueue<int []>pq=new PriorityQueue<>((x,y)->x[0]-y[0]);
       
        int r=grid.length;
         int c=grid[0].length;
         int dis[][]=new int[r][c];
        for(int i=0;i<r;i++){
            Arrays.fill(dis[i],(int)1e9);
        }    
        dis[0][0]=grid[0][0];
         pq.add(new int[]{t,0,0});
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int time =curr[0];
            int row=curr[1];
            int col=curr[2];
            for(int i=0;i<4;i++){
                int nr=row+dr[i];
                int nc=col+dc[i];
                if(nr>=0 && nc>=0 && nr<r  && nc <c){
                        int newTime=Math.max(time,grid[nr][nc]);
                        if(newTime<dis[nr][nc]){
                            dis[nr][nc]=newTime;
                            pq.add(new int[] {newTime,nr,nc});
                        }
                }
            }
        }
        return dis[r-1][c-1];
    }
}