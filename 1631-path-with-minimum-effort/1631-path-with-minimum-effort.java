class Solution {
    public int minimumEffortPath(int[][] h) {
        int r=h.length;
        int c=h[0].length;
        int effort[][]=new int[r][c];
        int dr[] = {-1, 1, 0, 0};
        int dc[] = {0, 0, -1, 1};   
        int curreffort=0;
        PriorityQueue<int[]> pq =new PriorityQueue<>((a,b) -> a[2] - b[2]);
        pq.add(new int[]{0,0,0});
        for(int x[]:effort){
            Arrays.fill(x,(int)1e9);
        }
        effort[0][0]=0;
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int row=curr[0];
            int col=curr[1];
            curreffort=curr[2];
            for(int d=0;d<4;d++){
                int nr=dr[d]+row;
                int nc=dc[d]+col;
                if(nr>=0 && nr<r&& nc>=0 && nc<c){
                    int diff = Math.abs(h[row][col] - h[nr][nc]);
                    int newEffort = Math.max(curreffort, diff);
                    if(newEffort < effort[nr][nc]) {
                        effort[nr][nc] = newEffort;
                        pq.add(new int[]{nr, nc, newEffort});
                    }
                }
            }
        }
    
        return effort[r-1][c-1];
    }
}