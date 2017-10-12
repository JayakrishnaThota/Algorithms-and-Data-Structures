public class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
       List<int[]> result = new ArrayList();
		List<int[]> heights = new ArrayList();
		for(int[] b: buildings){
			heights.add(new int[] {b[0],-b[2]});
			heights.add(new int[] {b[1],b[2]});
		}
		Collections.sort(heights, (a,b)->{
		if(a[0]!=b[0])
			return a[0]-b[0];
		return a[1]-b[1];
		});
		Queue<Integer> pq = new PriorityQueue<Integer>((a,b)->(b-a));
		int prev = 0;
		pq.offer(0);
		for(int[] h:heights){
			if(h[1]<0){
				pq.offer(-h[1]);
			}
			else{
				pq.remove(h[1]);
			}
			int cur = pq.peek();
			if(prev!=cur){
				prev = cur;
				result.add(new int[] {h[0],cur});
			}
		}
		return result;
    }
}