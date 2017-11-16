//TC:O(n2)
//SC:O(n)
package sorting;
import java.util.*;
public class quicksort {
	public void quicksort(int[] A){
		qs(A,0,A.length-1);
	}
	public void qs(int[] A, int low, int high){
		if(low<high){
			int pivot = partition(A,low,high);
			qs(A,low,pivot-1);
			qs(A,pivot+1,high);
		}
	}
	public static int partition(int arr[], int low, int high)
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

	public static void swap(int[] A, int a, int b){
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
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
		quicksort q = new quicksort();
		q.quicksort(array);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
}
