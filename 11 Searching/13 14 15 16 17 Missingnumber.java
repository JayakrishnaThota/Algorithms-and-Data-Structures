//O(n) time and O(1) space
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n)*(n+1)/2;
        for(int num:nums)
            sum-=num;
        return sum;
    }
}
