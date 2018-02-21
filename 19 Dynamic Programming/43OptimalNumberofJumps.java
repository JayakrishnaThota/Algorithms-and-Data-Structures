
public class Solution {
	public int jump(int[] A) {
		int curfar=0, curend=0, jumps=0;
		for(int i=0;i<A.length-1;i++){
			curfar = Math.max(curfar, i+A[i]);
			if(curend==i){
				jumps++;
				curend = curfar;
			}
		}
		return jumps;
	}
}
