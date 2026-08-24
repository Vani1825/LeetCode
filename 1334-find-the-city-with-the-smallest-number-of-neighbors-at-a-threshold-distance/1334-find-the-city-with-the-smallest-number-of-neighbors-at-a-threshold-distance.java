class Solution {
    public int findTheCity(int n, int[][] matrix, int d) {
        int [][]edges=new int[n][n];
        for(int i = 0; i < n; i++) {
        Arrays.fill(edges[i], (int)1e9);
        edges[i][i] = 0;
        }
        for(int []it:matrix){
            int u=it[0];
            int v=it[1];
            int wt=it[2];
            edges[u][v]=wt;
            edges[v][u]=wt;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(edges[i][j]==-1){
                    edges[i][j]=(int)1e9;
                }
                if(i==j)edges[i][j]=0;
            }
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    edges[i][j]=Math.min(edges[i][j],edges[i][k]+edges[k][j]);    
                }
            }
        }
        int mincount=Integer.MAX_VALUE;
        int city=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(edges[i][j]==(int)1e9){
                    edges[i][j]=-1;
                }
                if(i!=j && edges[i][j]<=d)count++;
            }
            if(count<=mincount){
                mincount=count;
                city=i;
            }
        }
        return city;
    }
}