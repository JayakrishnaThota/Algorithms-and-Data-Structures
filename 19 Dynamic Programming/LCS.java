package DynamicProgramming;
import java.util.Scanner;
//Given two strings s and t, find their longest common subsequence
public class lcs {
    //O(mn) time and space
    public int lcs(String s, String t){
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(s.charAt(i)==t.charAt(j)){
                    dp[i+1][j+1] = 1 + dp[i][j];
                }
                else{
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        lcs f = new lcs();
        System.out.println("Please enter the two strings for which you want to find the longest common subsequence");
        String s = in.nextLine();
        String t = in.nextLine();
        System.out.println("Length of the LCS of "+s+" and "+t+" is "+f.lcs(s,t));
    }
}
