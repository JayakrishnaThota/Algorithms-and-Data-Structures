//O(n) time and O(1) space
//Kadane's algorithm
class Solution {
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
