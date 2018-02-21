//O(mn) time and space
class Solution {
    public int optimalpath(int[][] cost) {
        if(cost==null || cost.length==0) return 0;
        int m = cost.length;
        int n = cost[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = cost[0][0];
        //Fill the first row
        for(int i=1;i<m;i++)
            dp[i][0] = dp[i-1][0] + cost[i][0];
        for(int j=1;j<n;j++)
            dp[0][j] = dp[0][j-1] + cost[0][j];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = Math.max(Math.max(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]);
            }
        }
        return dp[m][n];
    }
}
