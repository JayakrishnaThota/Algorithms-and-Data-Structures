//O(mn) time and space
class Solution {
    public int numDistinct(String s, String t) {
        //Sanity check
        if(s.length()<t.length()) return 0;
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
            dp[i][0] = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(s.charAt(i)==t.charAt(j)){
                    dp[i+1][j+1] = dp[i][j] + dp[i][j+1];
                }
                else{
                    dp[i+1][j+1] = dp[i][j+1];
                }
            }
        }
        return dp[m][n];
    }
}
