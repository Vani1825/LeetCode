class Solution {
    public int[][] merge(int[][] interval) {
       int n=interval.length;
       ArrayList<int []>list=new ArrayList<>();
       Arrays.sort(interval,(a,b)->Integer.compare(a[0],b[0]));
       for(int i=0;i<n;i++){
        int st=interval[i][0];
        int lt=interval[i][1];
        if(list.isEmpty() || list.get(list.size()-1)[1]<st){
            list.add(new int []{st,lt});
        }
        else{
            int last[]=list.get(list.size()-1);
            last[1]=Math.max(lt,last[1]);
        }
       }
      return list.toArray(new int [list.size()][]);
    }
}