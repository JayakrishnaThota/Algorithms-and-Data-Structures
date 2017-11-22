class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights==null || heights.length==0) return 0;
        Stack<Integer> stack = new Stack();
        int n = heights.length;
        int area = 0;
        for(int i=0;i<=n;i++){
            int h = i==n?0:heights[i];
            if(stack.isEmpty() || h>=heights[stack.peek()])
            stack.push(i);
            else{
                int tp = stack.pop();
                area = Math.max(area, heights[tp]*(stack.isEmpty()?i:i-stack.peek()-1));
                i--;
            }
        }
        return area;
    }
}
