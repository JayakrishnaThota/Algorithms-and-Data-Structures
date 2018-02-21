//O(n) time and space
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //Sanity check
        if(nums==null || nums.length==0 || k<=0) return new int[0];
        int n = nums.length;
        int[] result = new int[n-k+1];
        int index = 0;
        Deque<Integer> q = new ArrayDeque<Integer>();
        for(int i=0;i<nums.length;i++){
            while(!q.isEmpty() && i-k+1>q.peek())
            q.poll();
            //Remove items from the end
            while(!q.isEmpty() && nums[i]>nums[q.peekLast()])
                q.pollLast();
            q.offer(i);
            if(i>=k-1)
                result[index++] = nums[q.peek()];
        }
        return result;
    }
}
