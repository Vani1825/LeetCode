class Solution {
    public boolean isSubsequence(String s, String t) {
        int left=0;
        int tleft=0;
        while(left<s.length()&& tleft<t.length()){
            char ch=s.charAt(left);
            char ch2=t.charAt(tleft);
            if(ch==ch2){
                left++;
                tleft++;
            }
            else
            tleft++;
        }
        if(left==s.length())return true;
        else 
        return false;
    }
}