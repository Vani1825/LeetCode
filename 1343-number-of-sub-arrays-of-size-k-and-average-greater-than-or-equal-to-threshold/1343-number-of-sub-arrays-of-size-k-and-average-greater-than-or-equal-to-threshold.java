class Solution {
    public int numOfSubarrays(int[] arr, int k, int th) {
        int i=0,j=0,sum=0,count=0;
        while(j<arr.length){
            sum+=arr[j];
            if(j-i+1 <k)j++;
            else if(j-i+1 ==k){
                int avg=sum/k;
                if(avg >=th){
                    count++;
                }
             sum-=arr[i];
             i++;
             j++;
            }           
        }
        return count;
    }
}