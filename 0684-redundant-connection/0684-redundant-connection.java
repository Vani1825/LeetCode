class Solution {
    int []parent;
    int []size;
    private int find(int node){
        if(node==parent[node])return node;
        return parent[node]=find(parent[node]);
    }
    public int[] findRedundantConnection(int[][] edges) {
        parent=new int[edges.length+1];
        size=new int[edges.length+1];
        for(int i=0;i<=edges.length;i++){
            size[i]=1;
            parent[i]=i;
        }
        for(int []it:edges){
            int u=it[0];
            int v=it[1];
            int pU=find(u);
            int pV=find(v);
            if(pU==pV)return it;
            int sizeU=size[pU];;
            int sizeV=size[pV];
            if(sizeU<sizeV){
                parent[pU] = pV;
                size[pV]=size[pU]+size[pV];
            }
            else{
                parent[pV]=pU;
                size[pU]=size[pU]+size[pV];
            }
        }
        return new int[]{};
    }
}