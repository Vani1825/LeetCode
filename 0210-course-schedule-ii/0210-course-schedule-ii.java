class Solution {
    public int[] findOrder(int v, int[][] prep) {
        int indegree[]=new int [v];
        for(int []edge:prep){
            int course=edge[0];
            indegree[course]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int top[]=new int[v];

        int k=0;
        while(!q.isEmpty()){
            int node=q.remove();
            top[k++]=node;
            for(int []edge:prep){
                int course=edge[0];
                if(node==edge[1]){
                    indegree[course]--;
                    if(indegree[course]==0)q.add(course);
                }
            }
        }
        if(k<v)return new int[0];
        return top;
    }
}