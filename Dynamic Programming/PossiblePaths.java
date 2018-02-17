package DynamicProgramming;
import java.util.Scanner;
/*
The problem is to count all the possible paths from top left to bottom right of a mXn matrix
with the constraints that from each cell you can either move only to right or down
 */
public class PossiblePaths {
    //O(mn) time and space
    public int PossiblePaths(int m ,int n){
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++) dp[i][0] = 1;
        for(int j=0;j<n;j++) dp[0][j] = 1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PossiblePaths s = new PossiblePaths();
        System.out.println("Please enter the dimensions(row and column) of the matrix");
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println("The maximal nonzero square in this matrix is "+s.PossiblePaths(m,n));
        in.close();
    }
}
