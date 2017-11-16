//Tc:O(n2)
//Sc:O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        if(nums==null || nums.length<3) return result;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int low = i+1,high = nums.length-1;
                int sum = 0-nums[i];
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                        result.add(Arrays.asList(nums[low],nums[high],nums[i]));
                        while(low<high && nums[low]==nums[low+1]) low++;
                        while(low<high && nums[high]==nums[high-1]) high--;
                        low++;
                        high--;
                    }
                    else if(nums[low]+nums[high]>sum){
                        high--;
                    }
                    else
                        low++;
                }
            }
        }
         return result;
    }
}
