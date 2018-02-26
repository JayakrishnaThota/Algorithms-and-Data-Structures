//O(nlogk) and O(k)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        k = n-k;
        int low = 0, high = nums.length-1;
        while(low<high){
            int pivot = partition(nums, low, high);
            if(pivot==k) break;
            else if(pivot<k) low = pivot+1;
            else high = pivot-1;
        }
        return nums[k];
    }
   public int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        swap(arr,i+1,high);
        return i+1;
    }
    
    

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void shuffle(int[] nums){
        Random rand = new Random();
        for(int i=1;i<nums.length;i++){
            swap(nums,i,rand.nextInt(i+1));
        }
    }
    
}
