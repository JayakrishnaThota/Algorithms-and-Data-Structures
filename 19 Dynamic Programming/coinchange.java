package DynamicProgramming;
import java.util.*;
public class coinchange {
    //O(amount) space and O(n*amount) time  
    public int coinchange(int[] coins, int amount){
        int n = coins.length;
        int [] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for(int i=1;i<=amount;i++){
            for (int j = 0; j < n; j++) {
                if(i-coins[j]>=0){
                    dp[i] = Math.min(dp[i],1+dp[i-coins[j]]);
                }
            }
        }
        return (dp[amount]==amount+1)?-1:dp[amount];
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        coinchange s = new coinchange();
        System.out.println("Please enter the length and contents of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Please enter the amount");
        int N = in.nextInt();
        System.out.println("Minimum number of coins required is"+s.coinchange(arr, N));
        in.close();
    }
}
