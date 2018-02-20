//O(logmn) time and O(1) space
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;
        int r = matrix.length;
        int c = matrix[0].length;
        int rs = 0, cs = c-1;
        while(rs<r && cs>=0){
            if(matrix[rs][cs]==target) return true;
            else if(matrix[rs][cs]>target) cs--;
            else rs++;
        }
        return false;
    }
}
