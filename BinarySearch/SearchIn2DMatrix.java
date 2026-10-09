//Time Complexity: O(log(m*n))
//Space Complexity: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int m = matrix[0].length;
        int n = matrix.length;
        int low = 0;
        int high = m*n-1;
        while(low<=high){
              int mid = low+(high-low)/2;
              if(matrix[mid/m][mid%m]==target){
                return true;
              }
              else if(matrix[mid/m][mid%m]>target){
                high = mid-1;
              }
              else{
                low = mid+1;
              }
        }
        return false;
    }
}