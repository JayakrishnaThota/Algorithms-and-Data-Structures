//O(n) time and O(1) space
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList();
        if(nums==null || nums.length<2) return list;
        for(int i=0;i<nums.length;i++){
            int val = Math.abs(nums[i])-1;
            if(nums[val]<0)
                list.add(val+1);
            nums[val] = -nums[val];
        }
        return list;
    }
}
