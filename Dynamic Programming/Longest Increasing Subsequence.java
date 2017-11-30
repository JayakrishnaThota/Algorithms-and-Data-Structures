public int LIS(int[] nums)
{
int n = nums.length;
int[] dp = new int[nums.length];
int len = 0;
for(int num:nums){
int i = Arrays.binarySearch(dp,0,len,num);
if(i<0) i = -(i+1);
dp[i] = num;
if(i==len) len++;
}
return len;
}
