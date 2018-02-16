package DynamicProgramming;
import java.util.*;
//O(n2) time and O(n) space
public class lis {
    private int lis(int[] arr){
        if(arr==null || arr.length==0) return 0;
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        return dp[n-1];
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        lis s = new lis();
        System.out.println("Please enter the length and contents of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Longest increasing subsequence in the given array is"+s.lis(arr));
        in.close();
    }
}
