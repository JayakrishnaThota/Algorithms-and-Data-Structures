//O(n) time and space
class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int[] dp = new int[prices.length-1];
        for(int i=1;i<prices.length;i++){
            dp[i-1] = prices[i] - prices[i-1]; 
        }
        boolean neg = false;
        for(int d:dp){
            if(d>0){
                neg = true;
                break;
            } 
        }
        if(!neg) return 0;
        return maxSubArray(dp);
    }
    public int maxSubArray(int[] nums) {
        //Sanity check
        if(nums==null || nums.length==0) return 0;
        int maxsofar = nums[0], maxendinghere = nums[0];
        for(int i=1;i<nums.length;i++){
            maxsofar = Math.max(maxsofar+nums[i],nums[i]);
            maxendinghere = Math.max(maxsofar, maxendinghere);
        }
        return maxendinghere;
    }
}
