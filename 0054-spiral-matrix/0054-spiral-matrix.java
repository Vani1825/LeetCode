class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int row=m.length;
        int cols=m[0].length;
        List<Integer> result = new ArrayList<>();
        
        int left=0,right=cols-1,top=0,bottom=row-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                result.add(m[top][i]);
                //index++;
                
            }top++;
            for(int i=top;i<=bottom;i++){
                result.add(m[i][right]);
                //index++;
               
            } right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result.add(m[bottom][i]);
                    //index++;
                    
                }bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(m[i][left]);
                    //index++;
                   
                } left++;
            }
        }
        return result;
    }
}