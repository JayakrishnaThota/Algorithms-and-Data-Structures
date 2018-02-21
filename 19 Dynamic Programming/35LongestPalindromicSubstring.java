//Tc:O(n2), SC: O(n2)
public class Solution 
{
    public String longestPalindrome(String s) 
	{
		int n = s.length();
		boolean[][] dp = new boolean[n][n];
		String result = null;
		for(int i=n-1;i>=0;i--){
			for(int j=i;j<n;j++){
				dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j-i<3 || dp[i+1][j-1]);
				if(dp[i][j] && (result == null || (result.length()<j+1-i)))
				result = s.substring(i,j+1);
			}
		}
		return result;
	}
}