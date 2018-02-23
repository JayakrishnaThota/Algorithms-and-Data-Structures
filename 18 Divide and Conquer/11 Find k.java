// Given a sorted array of infinite length where only the first n are valid numbers and the rest all are dummies.
// Given k, find the index of k in the array within O(logn) time
//Algorithm:
//Step 1: Find the end of the list using binary search

public class Solution
{
	public int findIndex(int[] array, int K){
		if(array==null || array.length==0) return -1;
		int l=0,r=1;
		//Find the end of the array
		while(array[r]!='$'){
			if(K<=array[r])
			return binarysearch(array, l, r, K);
			l = r;
			r*=2;
		}	
		return -1;	
	}
	public int binarysearch(int[] array, int l, int r, int K){
		int low = l, right = r;
		while(low<=high){
			int mid = low+(high-low)/2;
			if(array[mid]==K) return mid; 
			else if(array[mid]>K) r = mid-1;
			else l = mid+1;
		}
		return -1;
	}
	
}
