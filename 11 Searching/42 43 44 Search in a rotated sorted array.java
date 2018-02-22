//O(logn) time and O(1) space
class Solution {
    public int search(int[] nums, int target) {
        //Find the original low
        int low = 0,high = nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[high])
                low = mid+1;
            else high = mid;
        }
        //Now low and high has the same value which is equal to the index of the smallest element in the array
        int rot = low;
        low=0;
        high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int realmid = (mid+rot)%nums.length;
            if(nums[realmid]==target) return realmid;
            else if(nums[realmid]>target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}
