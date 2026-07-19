class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int m = matrix.length;

       
            for (int j = 0 , i = n-1; j < m && i >=0; ) {
                if(target > matrix[j][i]) {
                    j++;
                }else if (target < matrix[j][i]) {
                    i--;
                }else {
                    return true;
                }

            }
         
         return false;
        
    }
}
