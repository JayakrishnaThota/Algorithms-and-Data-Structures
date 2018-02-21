package DynamicProgramming;
import java.util.*;
/*Given an array of n positive integers.
Write a program to find the sum of maximum sum subsequence
of the given array such that the intgers in the subsequence are sorted in increasing order.
For example, if input is {1, 101, 2, 3, 100, 4, 5},
then output should be 106 (1 + 2 + 3 + 100),
if the input array is {3, 4, 5, 10},
then output should be 22 (3 + 4 + 5 + 10) and if the input array is {10, 5, 4, 3}, then output should be 10
*/
public class MaximumSumIncreasingSubsequence
{
    //O(n2) time and O(n) space
    public int MaximumSumIncreasingSubsequence(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i] = arr[i];
            for(int j=0;j<i;j++){
                if((arr[i]>arr[j])&(dp[i]<dp[j]+arr[i]))
                    dp[i] = arr[i] + dp[j];
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        MaximumSumIncreasingSubsequence s = new MaximumSumIncreasingSubsequence();
        System.out.println("Please enter the length and contents of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Longest increasing subsequence in the given array is "+s.MaximumSumIncreasingSubsequence(arr));
        in.close();
    }
}
