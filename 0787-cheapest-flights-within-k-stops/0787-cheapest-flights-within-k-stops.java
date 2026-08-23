class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] dist = new int[k + 2][n];
        for (int i = 0; i < k + 2; i++) {
        Arrays.fill(dist[i], (int)1e9);
        }
        Queue<int []>q=new LinkedList<>();
        dist[0][src]=0;
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] flight : flights) {
            int u = flight[0];
            int v = flight[1];
            int cost = flight[2];
             graph[u].add(new int[]{v, cost});
        }
        q.add(new int []{src,0,0});
        while(!q.isEmpty()){
            int curr[]=q.poll();
            int node=curr[0];
            int stop=curr[1];
            int cost=curr[2];
            if(stop==k+1)continue;
           for (int[] ngh : graph[node]) {
                int next = ngh[0];
                int wt = ngh[1];
                if (cost + wt < dist[stop+1][next]) {
                   dist[stop+1][next] = cost + wt;
                   q.add(new int[]{next,stop+1,dist[stop+1][next]});
                }
           }
        }
      int ans = (int)1e9;
    for (int i = 0; i <= k + 1; i++) {
    ans = Math.min(ans, dist[i][dst]);
    }
    return ans == (int)1e9 ? -1 : ans;
    }
}