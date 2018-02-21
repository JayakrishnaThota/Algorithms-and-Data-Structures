package DynamicProgramming;
import java.util.*;
public class mincostpath {
    //O(mn) time and space
    public int mincostpath(int[][] matrix){
        if(matrix==null || matrix.length==0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = matrix[0][0];
        for(int i=1;i<m;i++) dp[i][0] = dp[i-1][0]+matrix[i][0];
        for(int j=1;j<n;j++) dp[0][j] = dp[0][j-1]+matrix[0][j];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        mincostpath s = new mincostpath();
        System.out.println("Please enter the dimensions(row and column) of the matrix");
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Please enter the contents of the matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("The maximal nonzero square in this matrix is"+s.mincostpath(matrix));
        in.close();
    }
}
