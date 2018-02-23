 public class Solution
 {
    public int getEnd(int[] nums, int target){
        int low = 0,  high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(((mid==high) && (nums[mid]==target)) || ((nums[mid]==target)&&(nums[mid]!=nums[mid+1]))) 
                return mid;
            else if(nums[mid]<=target)
                low = mid+1;
            else 
                high = mid-1;
        }
        return -1;
    }
}
