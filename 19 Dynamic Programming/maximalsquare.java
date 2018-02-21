package DynamicProgramming;
import java.util.Scanner;

public class maximalsquare {
    //O(mn) time and space
    public int maximalsquare(int[][] matrix){
        if(matrix==null || matrix.length==0) return 0;
        int max = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++) dp[i][0] = matrix[i][0];
        for(int j=0;j<n;j++) dp[0][j] = matrix[0][j];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==1){
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
                else
                    dp[i][j] = 0;
                max = Math.max(max, dp[i][j]);
            }
        }
        return max*max;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        maximalsquare s = new maximalsquare();
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
        System.out.println("The maximal nonzero square in this matrix is"+s.maximalsquare(matrix));
        in.close();
    }
}
