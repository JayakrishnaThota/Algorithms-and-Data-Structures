//TC:O(nlogn)
//SC:O(n)
package sorting;

import java.util.Scanner;

public class mergesort {
	public void mergesort(int[] A, int low, int high){
		int mid = (high+low)/2;
		if(low<high){
		mergesort(A,low,mid);
		mergesort(A,mid+1,high);
		merge(A,low,mid,high);
		}
	}
	public void merge(int[] A, int low, int mid, int high){
		int l1 = mid-low+1;
		int l2 = high-mid;
		int[] a = new int[l1];
		int[] b = new int[l2];
		for(int i=0;i<l1;i++){
			a[i] = A[i+low];
		}
		for(int i=0;i<l2;i++)
			b[i] = A[mid+1+i];
		int i=0,j=0,k=low;
		while(i<l1&&j<l2){
			if(a[i]<=b[j]){
				A[k++] = a[i++];
			}
			else{
				A[k++] = b[j++];
			}
		}
		while(i<a.length)
			A[k++] = a[i++];
		while(j<b.length)
			A[k++] = b[j++];
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Kindly enter the length of the array you want to sort");
		int length = in.nextInt();
		int[] array = new int[length];
		System.out.println("Kindly enter the contents of the array");
		for(int i=0;i<length;i++){
			array[i] = in.nextInt();
		}
		mergesort m = new mergesort();
		m.mergesort(array,0,array.length-1);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
}
