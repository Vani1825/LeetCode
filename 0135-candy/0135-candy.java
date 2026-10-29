class Solution {
    public int candy(int[] r) {
        int i=1;
        int sum=r.length;
        while( i<r.length){
            if(r[i]==r[i-1]){
                //sum+=1;
                i++;
                continue;
            }
            int up=0;
            while(i<r.length && r[i]>r[i-1]){
                up++;
                sum+=up;
                i++;
            }
            int down=0;
            while(i<r.length && r[i]<r[i-1]){
                down++;
                sum+=down;
                i++;
            }
            sum-=Math.min(up, down);
            
        }
        return sum;
    }
}