// Given a sorted array
// Given k, find the index such that A[i] = i;
//Algorithm:


public class Solution
{
	public boolean findIndex(int[] a, int l, int r){
		if(array==null || array.length==0) return false;
		if(r-l<=1)
		return (a[l]==l||a[r]==r);
		if(a[mid]==mid) return true;
		else if(a[mid]<mid) 
		return findIndex(a,mid+1,r);
		else
		return findIndex(a,l,mid-1);
	}
}