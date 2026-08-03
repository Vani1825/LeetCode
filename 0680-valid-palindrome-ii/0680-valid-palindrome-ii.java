class Solution {
    public boolean validPalindrome(String s) {
         int left=0;
         int right=s.length()-1;
         while(left<=right){
            char left1=s.charAt(left);
            char right1=s.charAt(right);
            if(left1==right1){
                left++;
                right--;
            }
            else{
                return isPalindrome(s,left+1,right)||
                isPalindrome(s,left,right-1);
            }
            
         }
         return true;
    }
    public boolean isPalindrome(String s,int left,int right){
        while(left<=right){
            char left2=s.charAt(left);
            char right2=s.charAt(right);
            if(left2==right2){
                left++;
                right--;
            }
            else 
            return false;
        }
        return true;
    }
}