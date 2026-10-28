class Solution {
    public int[][] insert(int[][] interval, int[] newInterval) {
        ArrayList<int []>list=new ArrayList<>();
        int i=0;
        int n=interval.length;
        while( i<n && interval[i][1]<newInterval[0]){
            list.add(interval[i]);
            i++;
        }
        while( i<n && interval[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(interval[i][0],newInterval[0]);
            newInterval[1]=Math.max(interval[i][1],newInterval[1]);
            i++;
        }
        list.add(newInterval);
        while(i<n){
            list.add(interval[i]);
            i++;
        }
        int s=list.size();
        int result[][]=new int[s][2];
        for(int j=0;j<s;j++){
            result[j][0]=list.get(j)[0];
            result[j][1]=list.get(j)[1];
        }
        return result;
    }
}