class Solution {
    int timer=0;
    public List<List<Integer>> criticalConnections(int V, List<List<Integer>> connections) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
            for(List<Integer>edge:connections){
                int u=edge.get(0);
                int v=edge.get(1);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
        
        int []dis=new int[V];
        int low[]=new int[V];
        Arrays.fill(dis,-1);
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(dis[i]==-1)dfs(i,-1,adj,dis,low,ans);
        }
        return ans;
    }
    public void dfs(int node,int parent,List<List<Integer>>adj,int dis[],int []low,List<List<Integer>>ans){
            dis[node]=low[node]=timer++;
            for(int v:adj.get(node)){
                if(v==parent)continue;
                if(dis[v]==-1){
                    dfs(v,node,adj,dis,low,ans);
                    low[node]=Math.min(low[node],low[v]);
                    if(low[v]>dis[node])
                        ans.add(Arrays.asList(node,v));
                }
                    else
                        low[node]=Math.min(low[node],dis[v]);
                
            }
    }
}









