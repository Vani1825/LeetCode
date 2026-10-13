class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int []seats=new int[n];
        for(int []book:bookings){
            int first=book[0]-1;
            int last=book[1]-1;
            int s=book[2];
            for(int i=first;i<=last;i++){
                seats[i]+=s;
            }
        }
        return seats;
    }
}