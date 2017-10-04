public int optimalstrategy(int[] array)
{
    int n = array.length;
    int[][] dp = new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0,k=i;j<n;k++,j++){
            // (F(i+2,j)
            int a = (i+2<=j?dp[i+2][j]:0);
            // (F(i+1,j-1)
            int b = (i+1<=j?-1?dp[i+1][j-1]:0);
            //F(i,j-2)
            int c = (i<=j-2?dp[i][j-2]:0);
            //Main formula
            dp[i][j] = Math.max((array[i]+Math.min(a,b)),(array[j]+Math.min(b,c)));
         }
      }
      return dp[0][n-1];
}
