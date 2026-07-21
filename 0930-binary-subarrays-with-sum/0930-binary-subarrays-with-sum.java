class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int prefix=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            if(map.containsKey(prefix-goal)){
                count+=map.getOrDefault(prefix-goal,0);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return  count;
    }
}