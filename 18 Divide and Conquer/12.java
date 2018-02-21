// Given a sorted array
// Given k, find the index such that A[i] = i;
//Algorithm:

import java.util.*;
public class Solution
{
	public int fixedPoint(int[] nums){
		return findIndex(nums,0,nums.length-1);
	}
	public int findIndex(int[] a, int l, int r){
		if(l<=r){
			int mid = (low+(high-low)/2);
			if(a[mid]==mid) return mid;
			else if(a[mid]>mid)
				return findIndex(a,low,mid-1);
			else 
				return findIndex(a,mid+1,high);
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the length of your array and then the contents of the array");
		int n = in.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++){
			nums[i] = in.nextInt();
		}
		System.out.println("Fixed point in the array is" +fixedPoint(nums));
	}
}
