public class subsetsum {
	public static boolean subsetsum(int[] array, int n, int sum){
		boolean[][] dp = new boolean[n+1][sum+1];
		for(int i=0;i<=sum;i++)
			dp[0][i] = false;
		for(int i=0;i<=n;i++)
			dp[i][0] = true;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=sum;j++){
				dp[i][j] = dp[i-1][j];
				if(j-array[i-1]>=0)
					dp[i][j] = dp[i-1][j] || (dp[i-1][j-array[i-1]]);
			}
		}
		return dp[n][sum];
	}

	public static void main(String[] args){
		int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        if (subsetsum(set, n, sum) == true)
           System.out.println("Found a subset with given sum");
        else
           System.out.println("No subset with given sum");
	}
}
