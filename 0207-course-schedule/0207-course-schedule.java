class Solution {
    public boolean canFinish(int v, int[][] depn) {
        int indegree[]=new int[v];
        for(int []edge:depn){
            int course=edge[0];
            indegree[course]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(indegree[i]==0)q.add(i);
        }
        int count=0;
        while(!q.isEmpty()){
            int node=q.remove();
            count++;
            for(int []edge:depn){
                int course=edge[0];
                int dep=edge[1];
                if(dep==node){
                    indegree[course]--;
                    if(indegree[course]==0)
                        q.add(course);
                }
            }
        }
        if(count<v)return false;
        return true;
    }
}