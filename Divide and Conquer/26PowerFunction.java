//Calculate k power n
public class Solution 
{
    public double power(int k, int n)
	{
       if(n==0) return 1;
	   double half = power(k,n/2);
	   if(n%2==0)
	   return half*half;
	   else if(n%2==1)
	   return half*half*k;
	   else
	   return half*half/n;
    }
}