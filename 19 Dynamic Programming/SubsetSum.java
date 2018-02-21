package DynamicProgramming;
import java.util.*;

public class SubsetSum {
    //O(n*sum) time and space
    public boolean subsetsum(int[] arr, int sum){
        if(sum==0) return true;
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];
        //Dp[n][sum] indicates if it is possible to form sum with n elements
        //When the sum is zero, it is possible to form that sum with all sizes of elements
        for(int i=0;i<=n;i++) dp[i][0] = true;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                dp[i][j] = dp[i-1][j];
                if(j-arr[i-1]>=0) dp[i][j]= dp[i-1][j] || (dp[i-1][j-arr[i-1]]);
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        SubsetSum s = new SubsetSum();
        System.out.println("Please enter the length of the array");
        int n = in.nextInt();
        System.out.println("Please enter the contents of the array");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) arr[i] = in.nextInt();
        System.out.println("Please enter the sum you want to check for");
        int sum = in.nextInt();
        System.out.println("The subset sum for the given value is "+s.subsetsum(arr,sum));
        in.close();
    }
}
