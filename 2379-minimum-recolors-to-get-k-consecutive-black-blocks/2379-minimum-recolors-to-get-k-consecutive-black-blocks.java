class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0,j=0;
        int ans=Integer.MAX_VALUE;
        HashMap<Character,Integer>map=new HashMap<>();
        while(j < blocks.length()){
            char ch=blocks.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(j-i+1 <k)j++;
            else  if(j-i+1 ==k){
                int x=map.getOrDefault('W',0);
                 ans=Math.min(x,ans);

                char t=blocks.charAt(i);
                map.put(t,map.get(t)-1);
                if(map.get(t)==0)map.remove(t);

                i++;
                j++;
            }
        }
        return ans;
    }
}