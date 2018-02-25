//O(n) time and O(1) space
class Solution {
    public int removeDuplicates(int[] nums) {
        //sanity Check
        if(nums==null || nums.length==0) return 0;
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            nums[index++] = nums[i];
        }
        return index;
    }
}
