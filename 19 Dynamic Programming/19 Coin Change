//O(n) space and O(nk) time 
class Solution {
    public int coinChange(int[] coins, int n) {
        int[] dp = new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i] = n+1;
            for(int j=0;j<coins.length;j++){
                if(i-coins[j]>=0){
                    dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
                }
            }
        }
        return dp[n]>n?-1:dp[n];
    }
}
