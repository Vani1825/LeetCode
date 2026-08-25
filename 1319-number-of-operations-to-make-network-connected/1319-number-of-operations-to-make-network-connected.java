class Solution {
    int parent[];
    int size[];
    public int findP(int node){
        if(node==parent[node])return node;
        return parent[node]=findP(parent[node]);
    }
    public int makeConnected(int n, int[][] connections) {
        int m=connections.length;
        parent=new int[n];
        size=new int [n];
        for(int i=0;i<n;i++){
            size[i]=1;
            parent[i]=i;
        }
        int re=0;
        int com=n;
        for(int it[]:connections){
            int u=it[0];
            int v=it[1];
            int pU=findP(u);
            int pV=findP(v);
            if(pV==pU)re++;
            else{
                com--;
            if(size[pU]<size[pV]){
                parent[pU]=pV;
                size[pU]+=size[pV];
            }
            else{
                parent[pV]=pU;
                size[pV]+=size[pU];
            }
            }
        }
        if(com-1<=re){
            return com-1;
        }
        else return -1;

    }
}