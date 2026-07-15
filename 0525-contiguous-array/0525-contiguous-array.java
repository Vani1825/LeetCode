class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int len=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=(nums[i]==0?-1:1);
            if(map.containsKey(sum)){
                len=Math.max(len,i-map.get(sum));
            }
        
        else
        map.put(sum,i);
        }
        return len;
    }
}