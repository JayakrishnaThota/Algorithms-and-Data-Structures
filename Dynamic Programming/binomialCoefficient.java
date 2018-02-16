package DynamicProgramming;
import java.util.*;
import java.lang.*;
public class binomialCoefficient {
    //O(nk) time and space
    public int binomialCoefficient(int n, int k) throws IllegalArgumentException{
        if(n<0) throw new IllegalArgumentException();
        if(k<0) throw new IllegalArgumentException();
        //C(n,0) = C(n,n) = 1
        //C(n,k) = C(n-1,k-1) + C(n-1, k)
        int[][] dp = new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=Math.min(i,k);j++){
                if(j==0 || i==j) dp[i][j] = 1;
                else{
                    dp[i][j] = dp[i-1][j-1]  + dp[i-1][j];
                }
            }
        }
        return dp[n][k];
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        binomialCoefficient f = new binomialCoefficient();
        System.out.println("Please enter the n and k values consecutively");
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println("Binomial coefficient value of "+n+" "+k+" is "+f.binomialCoefficient(n,k));
        in.close();
    }
}
