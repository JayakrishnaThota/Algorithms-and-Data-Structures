package DynamicProgramming;
import java.util.Scanner;
/*
1) Stack Permutations
2) Arrange open and closed parantheses
3) Binary search trees possible with n nodes
 */
public class CatalanNumbers {
    //O(n2) time and O(n) space
    public int catalannumber(int n) throws IllegalArgumentException{
        if(n<0) throw new IllegalArgumentException("Negative values not permitted");
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<n;i++){
            for(int j=0;j<i;j++){
                dp[i] = dp[i] + (dp[i-j-1]*dp[j]);
            }
        }
        return dp[n-1];
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CatalanNumbers f = new CatalanNumbers();
        System.out.println("Please enter the number for which you want to find the catalan value");
        int n = in.nextInt();
        System.out.println("Catalan series value of "+n+" is "+f.catalannumber(n));
    }
}
