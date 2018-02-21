package DynamicProgramming;
import java.util.*;

public class RodCutting {

    //O(len2) time and O(len) space
    public int RodCutting(int[] arr, int len){
        int n = arr.length;
        int[] dp = new int[len+1];
        dp[0] = 0;
        for(int i=1;i<=len;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                max = Math.max(max, arr[j]+dp[i-j-1]);
            }
            dp[i] = max;
        }
        return dp[len];
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        RodCutting r = new RodCutting();
        System.out.println("Please enter the length of the array");
        int n = in.nextInt();
        System.out.println("Please enter the contents of the array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Please enter the length of the rod");
        int len = in.nextInt();
        System.out.println("The maximal amount obtained by cutting the rod is "+r.RodCutting(arr,len));
        in.close();
    }
}
