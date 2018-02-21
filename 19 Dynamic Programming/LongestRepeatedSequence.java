package DynamicProgramming;
import java.util.*;
public class LongestRepeatedSequence {
    //O(n2) time and space
    public int LongestRepeatedSequence(String s){
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if ((s.charAt(i) == s.charAt(j)) && (i != j)) {
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[n][n];
    }

    public static void main(String[] args){
        LongestRepeatedSequence l = new LongestRepeatedSequence();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the string");
        String s = in.nextLine();
        System.out.println(l.LongestRepeatedSequence(s));
        in.close();
    }
}
