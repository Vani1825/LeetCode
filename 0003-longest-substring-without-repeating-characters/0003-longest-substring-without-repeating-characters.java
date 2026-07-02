import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,ans=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(j< s.length()){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(j-i+1 == map.size()){
                ans=Math.max(ans,j-i+1);
                j++;
            }
            else if(j-i+1 >map.size()){
                while(j-i+1 >map.size()){
                    char left=s.charAt(i);
                    map.put(left,map.get(left)-1);
                    if(map.get(left)==0)map.remove(left);
                    i++;
                }
                j++;
            }
        }
        return ans;
    }

}