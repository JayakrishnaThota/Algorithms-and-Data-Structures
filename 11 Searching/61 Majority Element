//O(n) and O(1)
class Solution {
    public int majorityElement(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int maj = nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==maj)
                count++;
            else{
                count--;
                if(count==0){
                    maj = nums[i];
                    count = 1;
                }
            }
        }
        return maj;
    }
}
