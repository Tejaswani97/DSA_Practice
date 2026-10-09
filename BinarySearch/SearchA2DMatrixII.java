class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int m = matrix[0].length;
        int n = matrix.length;
        int low = 0;
        int high = m-1;
        while(low<n && high>=0){
            if(matrix[low][high]==target){
                return true;
            }
            else if(matrix[low][high]>target){
                high--;
            }
            else{
                low++;
            }
        }
        return false;
    }
}
