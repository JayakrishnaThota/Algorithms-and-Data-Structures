class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int p = quickSelect(nums,0,n-1,n-k+1);
        return nums[p];
    }
    public int quickSelect(int[] nums, int low, int high, int k){
        int i = low, j = high, pivot = nums[high];
        while(i<j){
            if(nums[i++]>pivot)
                swap(nums,--i,--j);
        }
        swap(nums,i,high);
        int m = i-low+1;
        if(m==k) return i;
        else if(m>k) return quickSelect(nums,low,i-1,k);
        else return quickSelect(nums,i+1,high,k-m);
    }
                           
    
  void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }
}