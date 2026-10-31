class Solution {
    public int minAddToMakeValid(String s) {
        int open=0,close=0;
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }
            else{
                if(open>0)open--;
                else close++;
            }
            i++;
        }
        return open + close;
    }
}