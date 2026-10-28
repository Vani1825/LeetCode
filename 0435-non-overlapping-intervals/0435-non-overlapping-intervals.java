class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int lastend=Integer.MIN_VALUE;
        int count=0;
        int n=intervals.length;
        for(int i=0;i<n;i++){
            int s=intervals[i][0];
            int lt=intervals[i][1];
            if(s>=lastend){
                count++;
                lastend=lt;
            }
        }
        return n-count;
    }
}