class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int prefix=0,count=0;
        map.put(0,1);
        for(int num:nums){
            prefix+=num;
            int rem= prefix %k;
            if(rem<0)rem+=k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);

        }
        return count;
    }
}