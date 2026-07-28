import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String sc="";
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(!Character.isLetterOrDigit(ch))
            continue;
            sc=sc+ch;
        }
        String sb=new StringBuilder(sc).reverse().toString();
        if(sb.equals(sc))return true;
        else return false;
    }
}