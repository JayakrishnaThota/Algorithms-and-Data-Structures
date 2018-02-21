public class Solution {
    public int Kadane(int[] a){
		int maxendinghere = a[0], maxsofar = a[0];
		for(int i=1;i<a.length;i++){
			maxendinghere = Math.max(maxendinghere+a[i],a[i]);
			maxsofar = Math.max(maxendinghere, maxsofar);
		}
		return maxsofar;
	}
}