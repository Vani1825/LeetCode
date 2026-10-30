class Solution {
    public void moveZeroes(int[] a) {
        int write=0;
        int n=a.length;
        for(int read=0;read<n;read++){
            if(a[read]!=0){
                a[write]=a[read];
                write++;
            }
        }
                while (write < n) {
            a[write] = 0;
            write++;
        }
            for(int x:a){
                System.out.print(x+" ");
            }
    }
}